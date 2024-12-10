public class StepCounter {
    
    private static int totalSteps = 0;
    private int individualSteps;

    public StepCounter() {
        individualSteps = 0;
    }

    public static int getTotalSteps() {
        return totalSteps;
    }

    public void addSteps(int steps) {
        if (steps > 0) { 
            individualSteps += steps;
            totalSteps += steps;
        }
    }

    public int getIndividualSteps() {
        return individualSteps;
    }
}
