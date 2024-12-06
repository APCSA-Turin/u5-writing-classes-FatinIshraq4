public class Class2 {
    
    private String text; 

    public Class2(String text) {
        this.text = text; //B
    }

    // instance method 1
    public String displayText() { //C
        return "Current text: " + text; //B
    }

    //instance method 2
    public String scrambledText() { //D
        return StringUtility.scrambleString(text); //D
    }

    //Private helper method
    private static String removeVowels(String input) { //C
        String vowels = "aeiouAEIOU";
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) == -1) {
                result += input.charAt(i);
            }
        }
        return result; //B
    }


    public static String getTextWithoutVowels(String in) { //C
        return Class2.removeVowels(in); //C
    }

    public String removeSpaces() { //E
        return StringUtility.removeString(" ", text); //E
    }
}
