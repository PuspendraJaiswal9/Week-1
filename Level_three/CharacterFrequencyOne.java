import java.util.Scanner;

public class CharacterFrequencyOne {

    // Method to find the unique characters in a string
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index] = currentChar;
                index++;
            }
        }

        char[] uniqueChars = new char[index];
        System.arraycopy(temp, 0, uniqueChars, 0, index);

        return uniqueChars;
    }

    // Method to find the frequency of characters and return as a 2D array
    public static String[][] findCharacterFrequency(String text, char[] uniqueChars) {
        // Create an array to store the frequencies of unique characters
        String[][] result = new String[uniqueChars.length][2];

        // Loop through each unique character and calculate its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Loop through the text to find the frequency of the current character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            // Store the character and its frequency in the 2D array
            result[i][0] = Character.toString(currentChar);
            result[i][1] = Integer.toString(frequency);
        }

        return result;
    }

    // Method to display the results in a tabular format
    public static void displayCharacterFrequency(String[][] result) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find the unique characters in the string
        char[] uniqueChars = uniqueCharacters(text);

        // Find the frequency of each unique character
        String[][] result = findCharacterFrequency(text, uniqueChars);

        // Display the result in tabular format
        displayCharacterFrequency(result);

        sc.close();
    }
}
