import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize the count variable to 0
        int count = 0;

        // Check if the number is zero
        if (number == 0) {
            count = 1; // Zero has one digit
        } else {
            // Use a loop to count the digits
            while (number != 0) {
                number /= 10;  
                count++;       
            }
        }

        // Output the count of digits
        System.out.println("The number of digits is: " + count);
    }
}
