import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take number from the user
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Create an array to store frequency of digits (0-9)
        int[] frequency = new int[10];

        // Find the digits of the number and store them in the frequency array
        while (number > 0) {
            int digit = (int)(number % 10); // Get the last digit
            frequency[digit]++; // Increase the frequency of the digit
            number /= 10; // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
