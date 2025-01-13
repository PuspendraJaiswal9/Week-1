import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        double total = 0.0;

        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double userInput = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break; 
            }
            total += userInput;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}
