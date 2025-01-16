import java.util.Scanner;

public class WordLengthAnalysis {

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
        int wordCount = 1; // At least one word present

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

    // Method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordLengthTable) {
        String shortest = wordLengthTable[0][0];
        String longest = wordLengthTable[0][0];
        int shortestLength = Integer.parseInt(wordLengthTable[0][1]);
        int longestLength = Integer.parseInt(wordLengthTable[0][1]);

        for (String[] entry : wordLengthTable) {
            int length = Integer.parseInt(entry[1]);
            if (length < shortestLength) {
                shortest = entry[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = entry[0];
                longestLength = length;
            }
        }

        return new String[]{shortest, longest};
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

        // Find the shortest and longest strings
        String[] shortestAndLongest = findShortestAndLongest(wordLengthTable);

        // Display the result
        System.out.println("\nWord Analysis:");
        System.out.println("Shortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);

        sc.close();
    }
}
