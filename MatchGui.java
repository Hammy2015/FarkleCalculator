import javax.swing.*;
import java.awt.*;

public Class MatchGui{
    private int score;
    private int enemyScore;

    public MatchGui(){
        match JFrame = new JFrame("Farckle Match");

        match.setSize(900,600);

        ArrayList<> labels = new ArrayList<JLabel>();
        ArrayList<> buttons = new ArrayList<JButton>();
        ArrayList<> buttons = new ArrayList<JButton>();
        for(int i = 0; i < 6; i++){
            labels.add(new JLabel("Dice #" + (i + 1)))
            labels.add(new JButton("Dice #" + (i + 1)))
        }
    }
}