public class SimpleRobot {
    // class attributes
    private int stepsForward;
    private int stepsRight;

    // constructor without parameter
    public SimpleRobot() {
        super();
    }

    // constructor using parameter(s) : none

    // getters and setters
    public int getStepsForward() {
        return stepsForward;
    }

    public void setStepsForward(int stepsForward) {
        this.stepsForward = stepsForward;
    }

    public int getStepsRight() {
        return stepsRight;
    }

    public void setStepsRight(int stepsRight) {
        this.stepsRight = stepsRight;
    }

    // class methods
    public void forward(){
        this.stepsForward++;
    }

    public void right(){
        this.stepsRight++;
    }

    public boolean blocked(){
        return false; // To fix
    }
}
