import java.util.Scanner;

public class TextSplitter {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception is thrown when index exceeds length
        }
        return count;
    }

    // Method to split the text into words using charAt()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1; 

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

        // Extract words using space indexes
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start); 

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the text
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split text using custom method
        String[] customWords = customSplit(text);

        // Split text using String built-in split() method
        String[] builtInWords = text.split(" ");

        // Compare the two arrays
        boolean areEqual = compareArrays(customWords, builtInWords);

        // Display the results
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Custom Split Result: ");
        for (String word : customWords) {
            System.out.println(word);
        }
        System.out.println("Built-In Split Result: ");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        System.out.println("Are the two results equal? " + (areEqual ? "Yes" : "No"));

        sc.close();
    }
}
