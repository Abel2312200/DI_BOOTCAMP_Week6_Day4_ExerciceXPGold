
public class Dog {

    // declare an instance variable to hold the drinking time
    private int drinkTime;
    private boolean needsToGo;

    // constructor without parameters
    public Dog() {
        super();
    }

    // constructor with a parameter
    public Dog(int drinkTime) {
        super();
        this.drinkTime = drinkTime;
    }

    public void setDrinkTime(int time) {
        this.drinkTime = time;
    }

    public int getDrinkTime() {
        return drinkTime;
    }

    public boolean needsToGo() {
        if(drinkTime > 4)
            needsToGo = true;
        return needsToGo;
    }

}