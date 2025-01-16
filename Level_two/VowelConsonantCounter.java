import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        // Convert to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharType(ch);
            
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display the result
        System.out.println("\nCount of Vowels: " + counts[0]);
        System.out.println("Count of Consonants: " + counts[1]);

        sc.close();
    }
}
