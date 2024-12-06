public class runner {
    public static void main(String[] args) {

        //testing StringUtility class

        String original = "HelloWorld";
        String scrambled = StringUtility.scrambleString(original); //test scrambleString
        System.out.println("Original: " + original);
        System.out.println("Scrambled: " + scrambled);

        //test replaceCharacterV1
        System.out.println(StringUtility.replaceCharacterV1("a", "canned beans and bananas", "*"));

        //test removeString
        System.out.println(StringUtility.removeString("an", "canned beans and bananas"));


        //testing Class2

        Class2 class2 = new Class2("Hello World");

        // Test instance method 1
        System.out.println(class2.displayText()); 

        // Test instance method 2
        System.out.println(class2.scrambledText()); 

        // Test static method 
        System.out.println(Class2.getTextWithoutVowels("Hello World")); 

        // Test instance method calling the removeSpaces method
        System.out.println(class2.removeSpaces());
   }

    
}