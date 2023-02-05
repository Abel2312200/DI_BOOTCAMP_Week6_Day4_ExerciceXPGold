public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int total, timeRolled = 1;
        PairOfDice p = new PairOfDice();
        total = p.total();
        while (total != 2){
            timeRolled++; // update number of rolls
            p.roll();
            total = p.total();
        }
        System.out.println(String.format("We rolled %d time for getting a total equals as 2",timeRolled));
    }
}