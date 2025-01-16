import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; 
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count how many unique characters are there
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
        }

        return result; 
    }

    // Method to display the 2D array in a tabular format
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

        // Find the frequency of characters
        String[][] result = findCharacterFrequency(text);

        // Display the result in tabular format
        displayCharacterFrequency(result);

        sc.close();
    }
}
