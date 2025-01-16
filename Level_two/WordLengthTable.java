import java.util.Scanner;

public class WordLengthTable {

    // Method to find the length of a string without using the length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Stop counting when index is out of bounds
        }
        return count;
    }

    // Method to split the text into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1; 

        // Count spaces to calculate word count
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        // Store indexes of spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start); 

        return words;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] generateWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i]; // Word
            table[i][1] = String.valueOf(findLength(words[i])); 
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the text
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = customSplit(text);

        // Generate the 2D table of words and their lengths
        String[][] wordLengthTable = generateWordLengthTable(words);

        // Display the result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] row : wordLengthTable) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }

        sc.close();
    }
}
