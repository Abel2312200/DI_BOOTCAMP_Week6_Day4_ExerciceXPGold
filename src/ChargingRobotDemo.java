class ChargingRobotDemo {

    public static void charge(SimpleRobot r, int maxDist) {
        while (r.getStepsForward() != maxDist){
            r.forward();
        }
    }

    public static void main(String args[]) {
        SimpleRobot r = new SimpleRobot();
        r.forward();
        r.right();
        charge(r, 3);
    }

}