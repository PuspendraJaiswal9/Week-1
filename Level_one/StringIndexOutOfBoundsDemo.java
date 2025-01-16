import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        System.out.println("Character at index 100: " + text.charAt(100));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException...");
        try {
            generateException(text); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException...");
        handleException(text); 

        sc.close();
    }
}
