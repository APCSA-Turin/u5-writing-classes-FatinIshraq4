public class Nums {
    
    private int int1;
    private int int2;
    private int randomGenerated; 
    private static int totalRandomGenerated;

    public Nums(int num1, int num2) {
        int1=num1;
        int2=num2;
        randomGenerated=0;
    }

    public int randBetween() {
        totalRandomGenerated++;
        randomGenerated++;
        return (int) (Math.random()*(int2-int1+1)+int1);
    }

    public int getRandomNumsGenerated() {return randomGenerated;}

    public static int getTotalRandomNumsGenerated() {return totalRandomGenerated;}
}
