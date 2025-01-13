import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number and power from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize the result variable
        int result = 1;

        // Use a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the number in each iteration
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
