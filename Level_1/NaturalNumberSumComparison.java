import java.util.Scanner;

public class NaturalNumberSumComparison {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Compute the sum using a while loop
            int loopSum = 0;
            int counter = 1; 
            while (counter <= n) {
                loopSum += counter;
                counter++;
            }

            // Display the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Compare the results
            if (formulaSum == loopSum) {
                System.out.println("The result is correct.");
            } else {
                System.out.println("discrepancy in the computations.");
            }
        }
    }
}
