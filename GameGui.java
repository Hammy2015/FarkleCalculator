import javax.swing.*;
import java.awt.*;

public class GameGui{
    JFrame main;

    public gui(){
        main = new JFrame("My First GUI");
        main.setSize(400, 300);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a button
        JButton button = new JButton("Click Me!");
        
        // Create a label
        JLabel label = new JLabel("Hello, GUI!");

        // Get the content pane of the frame
        Container contentPane = main.getContentPane();
        contentPane.setLayout(new FlowLayout()); // Use a layout manager

        // Add components to the content pane
        contentPane.add(button);
        contentPane.add(label);

        main.setVisible(true);

    }
}