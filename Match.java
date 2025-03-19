import java.util.ArrayList;

public class Match {
    private int playerscore;
    private int computerscore;
    private ArrayList<Dice> playerdice;
    private ArrayList<Dice> computerdice;
    private int maxscore;

    public Match(Dice[] playerdice, Dice[] computerdice, int maxscore){
        //TODO: Implement this constructor, used for playing against the computer
    }

    public Match(Dice[] playerdice,int maxscore){
        this.playerdice = new ArrayList<>();
        for(int i = 0; i < playerdice.length; i++){
            this.playerdice.add(new Dice(playerdice[i]));
        }
        this.maxscore = maxscore;
        playerscore = 0;
    }
}
