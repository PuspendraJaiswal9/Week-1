import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");
        String longest = "";

        // Iterate through the words
        for (String word : words) {
            // Update the longest word if the current word is longer
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Print the longest word
        System.out.println("Longest word: " + longest);
    }
}
