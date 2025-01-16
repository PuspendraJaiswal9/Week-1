import java.util.Scanner;

public class VowelConsonantIdentifier {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        // Check if vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // Not a letter
        return "Not a Letter";
    }

    // Method to find vowels, consonants, or non-letters and return the result in a 2D array
    public static String[][] findCharTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch); 
            result[i][1] = checkCharType(ch); 
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        System.out.println("-----------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find character types
        String[][] result = findCharTypes(text);

        // Display result in tabular format
        displayResult(result);

        sc.close();
    }
}
