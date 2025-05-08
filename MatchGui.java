import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MatchGui extends JPanel{
    ///Match components
    private int playerscore;
    private int computerscore;
    private ArrayList<Dice> playerdice;
    private ArrayList<Dice> computerdice;
    private int maxscore;
    ///GUI components
    private JRadioButton[] diceRadio;
    private JTextField[] diceField;
    private JLabel explanationLabel;
    private JButton rollButton;
    private JLabel scoreLabel;
    private JTextField scoreField;
    private JTextField rollScoreField;
    private JLabel rollScoreLabel;

    public MatchGui(Dice[] playerdice,int maxscore){

        //Gui setups
        JFrame match = new JFrame("Farckle Match");

        match.setSize(900,600);
        match.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
        rollButton = new JButton ("Roll");
        rollButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                // Roll the dice
                // TODO: Implement the roll logic better
                // TODO: Check if the dice has already been locked in previous rolls, display that differently
                System.out.println("Rolling dice...");
                for (int i = 0; i < 6; i++){
                    if (diceRadio[i].isSelected()){
                        System.out.println("Dice " + (i + 1) + " is not selected, not rolling.");
                        playerdice[i].setStatus(false);
                    } else {
                        System.out.println("Dice " + (i + 1) + " is selected, rolling.");
                        playerdice[i].setStatus(true);
                    }
                }
                for (int i = 0; i < 6; i++){
                    System.out.println("Checking dice " + (i + 1) + ": " + playerdice[i].getValue());
                    if (playerdice[i].getStatus()){
                        playerdice[i].roll();
                        System.out.println("Dice " + (i + 1) + ": " + playerdice[i].getValue());
                        diceField[i].setText(String.valueOf(playerdice[i].getValue()));
                    }
                }

            }
        });
        scoreLabel = new JLabel ("My Score");
        scoreField = new JTextField (5);
        rollScoreField = new JTextField (5);
        rollScoreLabel = new JLabel ("Roll Score:");
        //adjust size and set layout
        setPreferredSize (new Dimension (225, 313));
        setLayout (null);

        //add components
        add (explanationLabel);
        add (rollButton);
        add (scoreLabel);
        add (scoreField);
        add (rollScoreField);
        add (rollScoreLabel);

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
        rollScoreField.setBounds (120, 250, 100, 25);
        rollScoreLabel.setBounds (20, 250, 100, 25);


        this.playerdice = new ArrayList<>();
        for(int i = 0; i < playerdice.length; i++){
            this.playerdice.add(new Dice(playerdice[i]));
        }
        this.maxscore = maxscore;
        playerscore = 0;
    }

    public MatchGui(Dice[] playerdice, Dice[] computerdice, int maxscore){
        //TODO: Implement this constructor, used for playing against the computer
    }

    public void startMatch(){
        JFrame match = new JFrame("Farckle Match");
        match.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        match.getContentPane().add(this);
        match.pack();
        match.setVisible(true);
    }

}