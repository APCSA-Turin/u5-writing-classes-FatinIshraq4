public class StringUtility {

    private StringUtility() {}

    private static String removeSpaces(String origString) {
        while (origString.indexOf(" ") >= 0) {
            int index = origString.indexOf(" ");
            origString = origString.substring(0, index) + origString.substring(index + 1);
          }
          return origString;
    }
        
    public static String scrambleString(String input) {
        input = removeSpaces(input); //A
        input = input.toLowerCase();
        String result = "";
        while (input.length() > 0) {
            int index = (int) (Math.random() * input.length());
            result += input.charAt(index);
            input = input.substring(0, index) + input.substring(index + 1);
        }
        return result;
    }    



    public static String replaceCharacterV1(String change, String orig, String replacement) {
        for (int i=0; i<orig.length(); i++) {
          String check = orig.substring(i,i+1);
          if (check.equals(change)) {
            String temp = orig.substring(0,i);
            String temp2 = orig.substring(i+1);
            orig = temp + replacement + temp2;
          }
          }
          return orig;
          }

    public static String removeString(String searchString, String origString) {
          while (origString.indexOf(searchString) >= 0) {
            int index = origString.indexOf(searchString);
            origString = origString.substring(0, index) + origString.substring(index + searchString.length());
          }
          return origString;
         }

    
    
}
