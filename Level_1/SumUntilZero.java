import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        double total = 0.0;
        double userInput;

        // Loop to get user input and calculate the sum
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            userInput = scanner.nextDouble();
            total += userInput; 
        } while (userInput != 0); 

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}
