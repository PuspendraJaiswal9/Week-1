import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the two numbers
        int number1, number2;

        // Take input for number1
        System.out.print("Enter the first number (number1): ");
        number1 = scanner.nextInt();

        // Take input for number2
        System.out.print("Enter the second number (number2): ");
        number2 = scanner.nextInt();

        // Print the original numbers
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swap the numbers
        int temp = number1; 
        number1 = number2;  
        number2 = temp;     

        // Print the swapped numbers
        System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);
    }
}
