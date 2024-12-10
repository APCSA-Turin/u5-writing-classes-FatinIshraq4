public class StepCounterTest {
    public static void main(String[] args) {
        StepCounter person1 = new StepCounter();
        StepCounter person2 = new StepCounter();
        person1.addSteps(5000);
        person2.addSteps(3000); 
        person1.addSteps(2000); 
        System.out.println("Person 1 steps: " + person1.getIndividualSteps());
        System.out.println("Person 2 steps: " + person2.getIndividualSteps());
        System.out.println("Total steps: " + StepCounter.getTotalSteps());
    }
}
