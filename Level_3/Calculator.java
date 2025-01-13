import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare two double variables for numbers and a string for the operator
        double first, second, result = 0.0;
        String op;

        // Input the first number
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        // Input the operator (+, -, *, /)
        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        // Input the second number
        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        // Perform the calculation based on the operator using switch-case
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                // Check if second number is zero to avoid division by zero
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;  
                }
                break;
            default:
                System.out.println("Invalid Operator");
                return;  
        }

        // Output 
        System.out.println("Result: " + result);
    }
}
