import java.util.Scanner;

public class NaturalNumberSumComparisonFor {
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

            // Compute the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Display the results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Compare the results
            if (formulaSum == loopSum) {
                System.out.println("Both computations match! The result is correct.");
            } else {
                System.out.println("There is a discrepancy in the computations.");
            }
        }
    }
}
