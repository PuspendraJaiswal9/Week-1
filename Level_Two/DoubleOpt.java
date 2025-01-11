import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double a, b, c;

        // Take input for a, b, and c
        System.out.print("Enter the value of a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        c = scanner.nextDouble();

        // Perform operations with precedence 
        double result1 = a + b * c; 
        double result2 = a * b + c; 
        double result3 = c + a / b; 
        double result4 = a % b + c; 

        // Display output
        System.out.println("Result of a + b * c: " + result1 +
                           ", a * b + c: " + result2 +
                           ", c + a / b: " + result3 +
                           ", a % b + c: " + result4);

     }
}
