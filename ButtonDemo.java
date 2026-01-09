import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Main class extending JFrame to create GUI
public class ButtonDemo extends JFrame {

    // Declare buttons and label
    JButton yes, no, close;
    JLabel lbl;

    // Constructor
    ButtonDemo() {
        // Initialize buttons and label
        yes = new JButton("YES");
        no = new JButton("NO");
        close = new JButton("CLOSE");
        lbl = new JLabel("");

        // Set layout and size
        setLayout(new GridLayout(4, 1));
        setSize(400, 200);

        // Add components to frame
        add(yes);
        add(no);
        add(close);
        add(lbl);

        // Make frame visible
        setVisible(true);

        // Optional: Close on exit (can be uncommented)
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create instance of handler and add listeners
        ButtonHandler bh = new ButtonHandler();
        yes.addActionListener(bh);
        no.addActionListener(bh);
        close.addActionListener(bh);
    }

    // Inner class to handle button events
    class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == yes) {
                lbl.setText("Button Yes is pressed");
            } else if (ae.getSource() == no) {
                lbl.setText("Button No is pressed");
            } else if (ae.getSource() == close) {
                System.exit(0);  // Exit the program
            }
        }
    }

    // Main method to start the GUI
    public static void main(String[] args) {
        new ButtonDemo();
    }
}
