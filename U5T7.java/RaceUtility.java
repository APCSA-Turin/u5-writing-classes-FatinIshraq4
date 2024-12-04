public class RaceUtility {

    public static double milesToKm(double miles) {
        return miles * 1.609;
    }

    public static double kmToMiles(double km) {
        return km / 1.609;
    }

    public static String makeProper(String orig) {
        String low = orig.toLowerCase();
        String proper = "";
        int i = 0;
        while (i<low.length()) {
            String character = low.substring(i, i + 1);
            if (i == 0) {
                proper += character.toUpperCase();
            } else {
                String before = low.substring(i - 1, i);
                if (before.equals(" ")) {
                    proper += character.toUpperCase();
                } else {
                    proper += character;
                }
            }
            i++;
        }
        return proper;
    }
}
