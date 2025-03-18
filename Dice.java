public class Dice{
    private int oneChance;
    private int twoChance;
    private int threeChance;
    private int fourChance;
    private int fiveChance;
    private int sixChance;

    private boolean status;

    public Dice(){
        oneChance = 1;
        twoChance = 1;
        threeChance = 1;
        fourChance = 1;
        fiveChance = 1;
        sixChance = 1;
        status = true;
    }
    public Dice(int oneChance, int twoChance, int threeChance, int fourChance, int fiveChance, int sixChance){
        this.oneChance = oneChance;
        this.twoChance = twoChance;
        this.threeChance = threeChance;
        this.fourChance = fourChance;
        this.fiveChance = fiveChance;
        this.sixChance = sixChance;
        status = true;
    }
    public Dice(int[] chances){
        oneChance = chances[0];
        twoChance = chances[1];
        threeChance = chances[2];
        fourChance = chances[3];
        fiveChance = chances[4];
        sixChance = chances[5];
        status = true;
    }
    public Dice(Dice dice){
        int[] chances = dice.getChances();
        oneChance = chances[0];
        twoChance = chances[1];
        threeChance = chances[2];
        fourChance = chances[3];
        fiveChance = chances[4];
        sixChance = chances[5];
        status = true;
    }
    private int totalChances(){
        return oneChance + twoChance + threeChance + fourChance + fiveChance + sixChance;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }
    public int roll(){
        int roll = (int)(Math.random() * totalChances()) + 1;
        if(roll <= oneChance){
            return 1;
        } else if(roll <= oneChance + twoChance){
            return 2;
        } else if(roll <= oneChance + twoChance + threeChance){
            return 3;
        } else if(roll <= oneChance + twoChance + threeChance + fourChance){
            return 4;
        } else if(roll <= oneChance + twoChance + threeChance + fourChance + fiveChance){
            return 5;
        } else {
            return 6;
        }
    }
    public int[] getChances(){
        return new int[]{oneChance, twoChance, threeChance, fourChance, fiveChance, sixChance};
    }
}