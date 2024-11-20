public class Spinner {
    int spaces;
    int lastSpin;
    int sum;
    int spins;

    public Spinner(int num) {spaces=num;}

    public int spin() {
        int i = (int) ((Math.random()*spaces)+1);
        lastSpin = i;
        sum+=i;
        spins++;
        return i;
    }

    public int getSpinValue() {return lastSpin;}
    public int getSpinCount() {return spins;}
    public int getSpinSum() {return sum;}

    public double averageSpin() {
        return (double)sum/spins;
    }
}
