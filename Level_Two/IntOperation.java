import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int a, b, c;

        // Take input for a, b, and c
        System.out.print("Enter the value of a: ");
        a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        c = scanner.nextInt();

        // Perform operations with precedence.
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display result.
        System.out.println("Result of a + b * c: " + result1 + 
                           ", a * b + c: " + result2 + 
                           ", c + a / b: " + result3 + 
                           ", a % b + c: " + result4);
    }
}
