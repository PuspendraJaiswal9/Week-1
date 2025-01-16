import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        System.out.println("Substring: " + text.substring(5, 3));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nDemonstrating IllegalArgumentException...");
        try {
            generateException(text); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        System.out.println("\nHandling IllegalArgumentException...");
        handleException(text); 

        sc.close();
    }
}
