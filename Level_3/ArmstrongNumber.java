import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum variable and originalNumber variable
        int sum = 0;
        int originalNumber = number;

        // Use a while loop to find the sum of cubes of each digit
        while (number != 0) {
            // Find the last digit of the number
            int digit = number % 10;

            // Find the cube of the digit and add it to sum
            sum += digit * digit * digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
