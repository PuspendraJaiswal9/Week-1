import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the greatestFactor variable
        int greatestFactor = 1;

        // Loop from number - 1 to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i; // Assign the greatest factor
                break; // Exit the loop after finding the greatest factor
            }
        }

        // Display the greatest factor outside the loop
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
