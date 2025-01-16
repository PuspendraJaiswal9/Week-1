import java.util.Scanner;

public class StringLengthFinder {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++; 
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception is thrown when the index is out of bounds, stop the loop
        }
        return count; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Find the length using the custom method
        int customLength = findLength(text);

        // Find the length using the built-in length() method
        int builtInLength = text.length();

        // Display the results
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
