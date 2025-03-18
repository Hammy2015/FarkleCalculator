import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGui{
    JFrame main;

    public GameGui(){
        main = new JFrame("Farkle Game");
        main.setSize(400, 300);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<JLabel> labels = new ArrayList<>();
        labels.add(new JLabel("2,000 point game"));
        labels.add(new JLabel("5,000 point game"));
        labels.add(new JLabel("10,000 point game"));
        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(new JButton("Start"){
            public void actionPerformed(ActionEvent e){
                // Start a 2,000 point game
            }
        });
        buttons.add(new JButton("Start"){
            public void actionPerformed(ActionEvent e){
                // Start a 5,000 point game
            }
        });
        buttons.add(new JButton("Start"){
            public void actionPerformed(ActionEvent e){
                // Start a 10,000 point game
            }
        });
        main.add(main);

        main.setVisible(true);

    }
}