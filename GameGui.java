import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGui extends JPanel{

    private JLabel scoreInputLabel;
    private JToggleButton soloMatchButton;
    private JTextField scoreInputField;
    private JLabel playSoloLabel;

    public GameGui(){
        //construct components
        scoreInputLabel = new JLabel ("Score to win:");
        soloMatchButton = new JToggleButton ("Start!", false);
        scoreInputField = new JTextField (5);
        playSoloLabel = new JLabel ("Play solo:");

        //adjust size and set layout
        setPreferredSize (new Dimension (289, 176));
        setLayout (null);

        //add components
        add (scoreInputLabel);
        add (soloMatchButton);
        add (scoreInputField);
        add (playSoloLabel);

        //set component bounds (only needed by Absolute Positioning)
        scoreInputLabel.setBounds (30, 45, 100, 25);
        soloMatchButton.setBounds (85, 75, 100, 25);
        scoreInputField.setBounds (135, 45, 100, 25);
        playSoloLabel.setBounds (80, 15, 100, 25);
    }

    public static void main(String args[]){
        //GameGui mainGui = new GameGui();
        JFrame mainGui = new JFrame ("GameGui");
        mainGui.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        mainGui.getContentPane().add (new GameGui());
        mainGui.pack();
        mainGui.setVisible (true);
    }
}