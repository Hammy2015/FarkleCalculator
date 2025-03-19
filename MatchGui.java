import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MatchGui extends JPanel{
    private int score;
    private int enemyScore;
    private JRadioButton[] diceRadio;
    private JTextField[] diceField;
    private JLabel explanationLabel;
    private JButton rollButton;
    private JLabel scoreLabel;
    private JTextField scoreField;

    public MatchGui(){
        JFrame match = new JFrame("Farckle Match");

        match.setSize(900,600);

        ArrayList<JLabel> labels = new ArrayList<>();
        ArrayList<JButton> buttons = new ArrayList<>();
        diceRadio = new JRadioButton[6];
        diceField = new JTextField[6];
        for (int i = 0; i < 6; i++){
            diceRadio[i] = new JRadioButton("Dice # " + (i + 1));
            diceField[i] = new JTextField(5);
            diceField[i] = new JTextField(5);
            diceField[i].setEnabled(false);
            add(diceRadio[i]);
            add(diceField[i]);
        }
        explanationLabel = new JLabel ("Hold dice");
        rollButton = new JButton ("Roll"){
            public void actionPerformed(ActionEvent e){
                // Roll the dice
            }
        };
        scoreLabel = new JLabel ("My Score");
        scoreField = new JTextField (5);
        //adjust size and set layout
        setPreferredSize (new Dimension (225, 313));
        setLayout (null);

        //add components
        add (explanationLabel);
        add (rollButton);
        add (scoreLabel);
        add (scoreField);

        //set component bounds (only needed by Absolute Positioning)
        diceRadio[0].setBounds (120, 95, 95, 25);
        diceRadio[1].setBounds (120, 120, 100, 25);
        diceRadio[2].setBounds (120, 145, 100, 25);
        diceRadio[3].setBounds (120, 170, 100, 25);
        diceRadio[4].setBounds (120, 195, 100, 25);
        diceRadio[5].setBounds (120, 220, 100, 25);
        explanationLabel.setBounds (120, 70, 100, 25);
        diceField[0].setBounds (20, 95, 100, 25);
        diceField[1].setBounds (20, 120, 100, 25);
        diceField[2].setBounds (20, 145, 100, 25);
        diceField[3].setBounds (20, 170, 100, 25);
        diceField[4].setBounds (20, 195, 100, 25);
        diceField[5].setBounds (20, 220, 100, 25);
        rollButton.setBounds (65, 250, 100, 25);
        scoreLabel.setBounds (20, 0, 100, 25);
        scoreField.setBounds (20, 20, 100, 25);
    }


}