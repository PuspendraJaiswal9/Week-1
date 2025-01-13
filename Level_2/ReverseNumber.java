import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take number input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Save the original number to a variable
        int originalNumber = number;

        // Count digits in the number
        int count = 0;
        while (number != 0) {
            count++;  // Increment the count for each digit
            number /= 10;  // Remove the last digit
        }

        // Create an array to store the digits
        int[] digits = new int[count];
        number = originalNumber; // Reset the number back to the original

        // Extract digits and store them in the array
        int index = 0;
        while (number != 0) {
            digits[index] = number % 10;  // Get the last digit
            number /= 10;  // Remove the last digit
            index++;  // Increment the index
        }

        // Display the array in reverse order (it's already stored in reverse)
        System.out.print("Reversed number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);  // Print each digit in the array
        }
        System.out.println();

        scanner.close();
    }
}
