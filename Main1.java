import java.awt.*;
import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {

        ImageIcon image=new ImageIcon("C:/Users/Akshansh/Pictures/picture.webp"); //create an image icon

        JLabel label = new JLabel(); //creates a label
        label.setText("Bro,do you even code?"); //set text of label
        label.setIcon(image); //set image to the label
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.green); //set text color
        label.setFont(new Font("MV Boli",Font.PLAIN, 30)); //set font of text

        JFrame frame=new JFrame();//creates a frame
        frame.setTitle("Jframe title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        // frame.setResizable(false);//cannot be resized
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.white);//sets background color
        
        frame.add(label); //add label to frame
    }
}
