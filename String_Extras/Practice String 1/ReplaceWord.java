import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter word to replace: ");
        String target = input.nextLine();
        System.out.print("Enter replacement word: ");
        String replacement = input.nextLine();

        // Replace the target word with the replacement word
        String modifiedSentence = sentence.replace(target, replacement);

        // Print the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
