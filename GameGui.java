import javax.swing.*;
import java.awt.*;

public class GameGui{
    JFrame main;

    public GameGui(){
        main = new JFrame("My First GUI");
        main.setSize(400, 300);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        main.add(main);

        main.setVisible(true);

    }
}