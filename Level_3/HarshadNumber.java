import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum variable to 0
        int sum = 0;
        int originalNumber = number;

        // Calculate the sum of digits
        while (number != 0) {
            int digit = number % 10;         
            sum += digit;                         
            number /= 10;             
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
    }
}
