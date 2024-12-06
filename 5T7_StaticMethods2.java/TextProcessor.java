import java.util.Scanner;

public class TextProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input
        System.out.print("Enter a string to process: ");
        String userInput = scanner.nextLine();

        Class2 textProcessor = new Class2(userInput);

        // Display original text
        System.out.println("\n1. Original Text: " + textProcessor.displayText());

        // Scramble text
        System.out.println("2. Scrambled Text: " + textProcessor.scrambledText());

        // Remove spaces
        System.out.println("3. Text Without Spaces: " + textProcessor.removeSpaces());

        // Remove vowels 
        System.out.println("4. Text Without Vowels: " + Class2.getTextWithoutVowels(userInput));

        // Replace a character 
        System.out.print("Enter the character you want to replace: ");
        String charToReplace = scanner.nextLine();
        System.out.print("Enter the replacement character: ");
        String replacementChar = scanner.nextLine();
        String replacedText = StringUtility.replaceCharacterV1(charToReplace, userInput, replacementChar);
        System.out.println("5. Text After Replacing '" + charToReplace + "' with '" + replacementChar + "': " + replacedText);

        // Remove a substring 
        System.out.print("Enter the substring you want to remove: ");
        String substringToRemove = scanner.nextLine();
        String textWithoutSubstring = StringUtility.removeString(substringToRemove, userInput);
        System.out.println("6. Text After Removing Substring '" + substringToRemove + "': " + textWithoutSubstring);

        scanner.close();
    }
}
