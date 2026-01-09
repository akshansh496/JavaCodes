import javax.swing.*;
import java.awt.event.*;

public class SwingExample {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(400, 300);
        
        // Create a JButton
        JButton button = new JButton("Click Me");
        
        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });
        
        // Add button to the frame
        frame.add(button);
        
        // Set frame default behavior
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set frame visibility
        frame.setVisible(true);
    }
}