public class Dice {
    int rolls;
    int sides;
    int lastRoll;

    public Dice(int sid) {
        sides = sid;
    }

    public int roll() {
        int i = (int) ((Math.random()*sides)+1);
        lastRoll = i;
        rolls++;
        return i;
    }

    public void setSides(int num) {
        sides = num;
    }

    public int getSides() {
        return sides;
    }

    public int getRollCount() {
        return rolls;
    }

    public int getRollValue() {
        return lastRoll;
    }
    public static void main(String[] args) {
        Dice dice1 = new Dice(6);
int sides = dice1.getSides();
System.out.println(sides);
System.out.println("default count = " + dice1.getRollCount());
System.out.println("default roll = " + dice1.getRollValue());
System.out.println();

dice1.roll();
System.out.println("count = " + dice1.getRollCount());
System.out.println("roll = " + dice1.getRollValue());
dice1.roll();
System.out.println("count = " + dice1.getRollCount());
System.out.println("roll = " + dice1.getRollValue());
dice1.roll();
System.out.println("count = " + dice1.getRollCount());
System.out.println("roll = " + dice1.getRollValue());
System.out.println();

dice1.setSides(20);
sides = dice1.getSides();
System.out.println(sides);
dice1.roll();
System.out.println("count = " + dice1.getRollCount());
System.out.println("roll = " + dice1.getRollValue());
System.out.println();

Dice dice2 = new Dice(10);
dice2.roll();
dice2.roll();
dice2.roll();
dice2.roll();
dice2.roll();
dice2.roll();
dice2.roll();
System.out.println("count = " + dice2.getRollCount());
System.out.println("count = " + dice1.getRollCount());

    }
}