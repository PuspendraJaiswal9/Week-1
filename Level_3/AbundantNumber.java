import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum variable to 0
        int sum = 0;

        // Find the sum of divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a divisor of the number
                sum += i;            // Add i to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}
