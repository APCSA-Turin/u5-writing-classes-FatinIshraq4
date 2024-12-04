public class Temperature {
    
    private double highTemp;
    private double lowTemp;
    private String scale;

    public Temperature(double hi, double low, String s) {
        highTemp=hi;
        lowTemp=low;
        if (s.equals("F") || s.equals("C")) {
            scale = s;
          } else {
            scale = "F";
          }
      

    }

    public static double convertCtoF(double temp) {
        return (temp * 1.8) + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) * 5 / 9;
    }

    public void changeToC() {
        if (scale.equals("F")) {
        highTemp = convertFtoC(highTemp);
        lowTemp = convertFtoC(lowTemp);
        scale = "C";
        }
    }

    public void changeToF() {
        if (scale.equals("C")) {
        highTemp = convertCtoF(highTemp);
        lowTemp = convertCtoF(lowTemp);
        scale = "F";
        }
    }

    public String tempInfo() {
        return "High Temperatire: " + highTemp + " " + scale + "\nLow Temperature: " + lowTemp + " " + scale;
    }

}
