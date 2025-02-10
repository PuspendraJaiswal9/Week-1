import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int vowels = 0, consonants = 0;

        // Loop through each character in the string
        for (char ch : str.toLowerCase().toCharArray()) {
            // Check if the character is a vowel
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } 
            // Check if it's a consonant
            else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        // Print the result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
