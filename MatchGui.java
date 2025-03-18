import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MatchGui{
    private int score;
    private int enemyScore;

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
    }
}