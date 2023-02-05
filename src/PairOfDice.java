public class PairOfDice {

    // class attributes
    private int die1;
    private int die2;

    // constructor without parameters
    public PairOfDice() {
        die1 = (int)(Math.random()*(6)+1);
        die2 = (int)(Math.random()*(6)+1);
    }

    // constructor with parameter(s): none

    // getters and setters

    public int getDie1() {
        return die1;
    }

    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public int getDie2() {
        return die2;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }

    // class methods
    public int total(){
        return (this.die1 + this.die2);
    }

    public void roll(){
        die1 = (int)(Math.random()*(6)+1);
        die2 = (int)(Math.random()*(6)+1);
    }
}
