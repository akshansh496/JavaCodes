import java.awt.*;
import java.io.*;
import java.nio.file.*;
import java.util.HashMap;
import javax.swing.*;

public class StressLevelTool extends JFrame {
    private JRadioButton[][] options = new JRadioButton[10][3];
    private JButton submitButton, saveButton, logoutButton;
    private JProgressBar stressBar;

    private static final String USER_FILE = "users.txt";
    private static HashMap<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        loadUsers();
        SwingUtilities.invokeLater(AuthScreen::new);
    }

    // ------------ Combined Login/Register Screen ------------
    static class AuthScreen extends JFrame {
        private boolean isLoginMode = true;

        public AuthScreen() {
            setTitle("Stress Level Tool - Login/Register");
            setSize(400, 300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JLabel titleLabel = new JLabel("Login", JLabel.CENTER);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 2;
            add(titleLabel, gbc);

            gbc.gridy++;
            gbc.gridwidth = 1;
            add(new JLabel("Username:"), gbc);
            JTextField usernameField = new JTextField();
            gbc.gridx = 1;
            add(usernameField, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            add(new JLabel("Password:"), gbc);
            JPasswordField passwordField = new JPasswordField();
            gbc.gridx = 1;
            add(passwordField, gbc);

            gbc.gridy++;
            gbc.gridx = 0;
            JButton actionButton = new JButton("Login");
            gbc.gridwidth = 1;
            add(actionButton, gbc);

            gbc.gridx = 1;
            JButton switchButton = new JButton("Create Account");
            add(switchButton, gbc);

            actionButton.addActionListener(e -> {
                String user = usernameField.getText().trim();
                String pass = new String(passwordField.getPassword());

                if (user.isEmpty() || pass.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "All fields required.");
                    return;
                }

                if (isLoginMode) {
                    if (users.containsKey(user) && users.get(user).equals(pass)) {
                        dispose();
                        new StressLevelTool(user);
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid login.");
                    }
                } else {
                    if (users.containsKey(user)) {
                        JOptionPane.showMessageDialog(this, "User exists.");
                    } else {
                        users.put(user, pass);
                        saveUsers();
                        JOptionPane.showMessageDialog(this, "Registration successful.");
                        switchToLogin(titleLabel, actionButton, switchButton);
                    }
                }
            });

            switchButton.addActionListener(e -> {
                if (isLoginMode) {
                    switchToRegister(titleLabel, actionButton, switchButton);
                } else {
                    switchToLogin(titleLabel, actionButton, switchButton);
                }
            });

            setVisible(true);
        }

        private void switchToRegister(JLabel title, JButton action, JButton toggle) {
            isLoginMode = false;
            title.setText("Register");
            action.setText("Register");
            toggle.setText("Back to Login");
        }

        private void switchToLogin(JLabel title, JButton action, JButton toggle) {
            isLoginMode = true;
            title.setText("Login");
            action.setText("Login");
            toggle.setText("Create Account");
        }
    }

    // ------------ Main Stress Tool ------------
    public StressLevelTool(String username) {
        setTitle("Stress Tool - Logged in as " + username);
        setSize(800, 850);
        setLayout(new GridLayout(0, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] questions = {
                "1. How often do you feel anxious or overwhelmed?",
                "2. How is your sleep quality?",
                "3. How do you usually feel during the day?",
                "4. How often do you exercise?",
                "5. How much screen time do you have daily?",
                "6. Do you often feel tired or low on energy?",
                "7. Do you have trouble concentrating?",
                "8. How often do you feel tense or experience muscle pain?",
                "9. Do you feel in control of your responsibilities?",
                "10. How often do you take time to relax or unwind?"
        };

        String[][] answers = {
                {"Rarely", "Sometimes", "Often"},
                {"Good", "Average", "Poor"},
                {"Happy", "Neutral", "Irritable"},
                {"Regularly", "Sometimes", "Rarely"},
                {"<2 hours", "2-5 hours", "5+ hours"},
                {"Never", "Sometimes", "Often"},
                {"No", "Sometimes", "Yes"},
                {"Rarely", "Sometimes", "Often"},
                {"Yes", "Somewhat", "Not at all"},
                {"Daily", "Weekly", "Rarely"}
        };

        for (int i = 0; i < 10; i++) {
            add(new JLabel(questions[i]));
            options[i] = createRadioButtonGroup(answers[i]);
        }

        submitButton = new JButton("Analyze My Stress Level");
        add(submitButton);

        stressBar = new JProgressBar(0, 20);
        stressBar.setStringPainted(true);
        add(new JLabel("Visual Stress Indicator:"));
        add(stressBar);

        saveButton = new JButton("Export Result (Text File)");
        logoutButton = new JButton("Logout");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(logoutButton);
        add(buttonPanel);

        submitButton.addActionListener(e -> analyzeStress());
        saveButton.addActionListener(e -> saveResultToPDF());
        logoutButton.addActionListener(e -> {
            dispose();
            new AuthScreen();
        });

        setVisible(true);
    }

    private JRadioButton[] createRadioButtonGroup(String[] labels) {
        ButtonGroup group = new ButtonGroup();
        JRadioButton[] buttons = new JRadioButton[labels.length];
        for (int i = 0; i < labels.length; i++) {
            buttons[i] = new JRadioButton(labels[i]);
            group.add(buttons[i]);
            add(buttons[i]);
        }
        return buttons;
    }

    private int getSelectedIndex(JRadioButton[] buttons) {
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) return i;
        }
        return 0;
    }

    private void analyzeStress() {
        int score = 0;
        for (int i = 0; i < 10; i++) {
            score += getSelectedIndex(options[i]);
        }

        stressBar.setValue(score);
        String level, tips, triggers;
        Color color;

        if (score <= 6) {
            level = "Low";
            color = Color.GREEN;
            tips = "- Gratitude journaling\n- 5-minute meditation\n- Stay socially active";
            triggers = "- Minimal workload\n- Balanced routine\n- Good social support";
        } else if (score <= 13) {
            level = "Moderate";
            color = Color.ORANGE;
            tips = "- Deep breathing (4-7-8)\n- Light yoga or walk\n- Reflective journaling";
            triggers = "- Deadlines\n- Irregular sleep\n- Too much screen time";
        } else {
            level = "High";
            color = Color.RED;
            tips = "- Guided meditation\n- Talk to someone\n- Take screen-free breaks";
            triggers = "- Chronic overwork\n- Lack of rest\n- Social isolation";
        }

        stressBar.setForeground(color);

        JTextArea popup = new JTextArea("Stress Level: " + level +
                "\n\nRecommended Activities:\n" + tips +
                "\n\nCommon Triggers:\n" + triggers);
        popup.setFont(new Font("Monospaced", Font.PLAIN, 14));
        popup.setEditable(false);
        popup.setBackground(Color.WHITE);
        popup.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(popup);
        scrollPane.setPreferredSize(new Dimension(400, 250));

        JOptionPane.showMessageDialog(this, scrollPane, "Stress Report", JOptionPane.INFORMATION_MESSAGE);
    }

    private void saveResultToPDF() {
        try {
            int score = 0;
            for (int i = 0; i < 10; i++) score += getSelectedIndex(options[i]);

            String level = score <= 6 ? "Low" : (score <= 13 ? "Moderate" : "High");
            String tips = level.equals("Low") ? "- Gratitude journaling\n- 5-minute meditation"
                    : level.equals("Moderate") ? "- Deep breathing\n- Light yoga"
                    : "- Guided meditation\n- Talk to someone";

            String triggers = level.equals("Low") ? "- Balanced routine"
                    : level.equals("Moderate") ? "- Deadlines, screen time"
                    : "- Overwork, lack of sleep";

            String report = "Stress Level: " + level + "\n\nRecommended Activities:\n" + tips + "\n\nTriggers:\n" + triggers;

            Files.write(Paths.get("StressReport.txt"), report.getBytes());
            JOptionPane.showMessageDialog(this, "Result exported to StressReport.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving result.");
        }
    }

    // ------------ Load/Save Users ------------
    private static void loadUsers() {
        try {
            File file = new File(USER_FILE);
            if (!file.exists()) file.createNewFile();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) users.put(parts[0], parts[1]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveUsers() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE));
            for (String user : users.keySet()) {
                writer.write(user + ":" + users.get(user));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}