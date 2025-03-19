import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MatchGui extends JPanel{
    private int score;
    private int enemyScore;
    private JRadioButton diceOneRadio;
    private JRadioButton diceTwoRadio;
    private JRadioButton diceThreeRadio;
    private JRadioButton diceFourRadio;
    private JRadioButton diceFiveRadio;
    private JRadioButton diceSixRadio;
    private JLabel explanationLabel;
    private JTextField diceOneField;
    private JTextField diceTwoField;
    private JTextField diceThreeField;
    private JTextField diceFourField;
    private JTextField diceFiveField;
    private JTextField diceSixField;
    private JToggleButton rollButton;
    private JLabel scoreLabel;
    private JTextField scoreField;

    public MatchGui(){
        JFrame match = new JFrame("Farckle Match");

        match.setSize(900,600);

        ArrayList<JLabel> labels = new ArrayList<>();
        ArrayList<JButton> buttons = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            labels.add(new JLabel("Dice #" + (i + 1)));
            buttons.add(new JButton("Roll"){
                public void actionPerformed(ActionEvent e){
                    // Roll the dice
                }
            });
        }
        diceOneRadio = new JRadioButton ("Dice # 1");
        diceTwoRadio = new JRadioButton ("Dice # 2");
        diceThreeRadio = new JRadioButton ("Dice # 3");
        diceFourRadio = new JRadioButton ("Dice # 4");
        diceFiveRadio = new JRadioButton ("Dice # 5");
        diceSixRadio = new JRadioButton ("Dice # 6");
        explanationLabel = new JLabel ("Hold dice");
        diceOneField = new JTextField (5);
        diceTwoField = new JTextField (5);
        diceThreeField = new JTextField (5);
        diceFourField = new JTextField (5);
        diceFiveField = new JTextField (5);
        diceSixField = new JTextField (5);
        rollButton = new JToggleButton ("Roll", false);
        scoreLabel = new JLabel ("My Score");
        scoreField = new JTextField (5);

        //set components properties
        diceOneField.setEnabled (false);
        diceTwoField.setEnabled (false);
        diceThreeField.setEnabled (false);
        diceFourField.setEnabled (false);
        diceFiveField.setEnabled (false);
        diceSixField.setEnabled (false);
        scoreField.setEnabled (false);

        //adjust size and set layout
        setPreferredSize (new Dimension (225, 313));
        setLayout (null);

        //add components
        add (diceOneRadio);
        add (diceTwoRadio);
        add (diceThreeRadio);
        add (diceFourRadio);
        add (diceFiveRadio);
        add (diceSixRadio);
        add (explanationLabel);
        add (diceOneField);
        add (diceTwoField);
        add (diceThreeField);
        add (diceFourField);
        add (diceFiveField);
        add (diceSixField);
        add (rollButton);
        add (scoreLabel);
        add (scoreField);

        //set component bounds (only needed by Absolute Positioning)
        diceOneRadio.setBounds (120, 95, 95, 25);
        diceTwoRadio.setBounds (120, 120, 100, 25);
        diceThreeRadio.setBounds (120, 145, 100, 25);
        diceFourRadio.setBounds (120, 170, 100, 25);
        diceFiveRadio.setBounds (120, 195, 100, 25);
        diceSixRadio.setBounds (120, 220, 100, 25);
        explanationLabel.setBounds (120, 70, 100, 25);
        diceOneField.setBounds (20, 95, 100, 25);
        diceTwoField.setBounds (20, 120, 100, 25);
        diceThreeField.setBounds (20, 145, 100, 25);
        diceFourField.setBounds (20, 170, 100, 25);
        diceFiveField.setBounds (20, 195, 100, 25);
        diceSixField.setBounds (20, 220, 100, 25);
        rollButton.setBounds (65, 250, 100, 25);
        scoreLabel.setBounds (20, 0, 100, 25);
        scoreField.setBounds (20, 20, 100, 25);

    }
}