import java.util.ArrayList;

public class Match {
    private int playerscore;
    private int computerscore;
    private ArrayList<Dice> playerdice;
    private ArrayList<Dice> computerdice;
    private int maxscore;

    public Match(Dice[] playerdice, Dice[] computerdice, int maxscore){
        this.playerdice = new ArrayList<>();
        this.computerdice = new ArrayList<>();
        for(int i = 0; i < playerdice.length; i++){
            this.playerdice.add(new Dice(playerdice[i]));
        }
        for(int i = 0; i < computerdice.length; i++){
            this.computerdice.add(new Dice(computerdice[i]));
        }
        this.maxscore = maxscore;
    }
}
