import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else if (number == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            long factorial = 1; 
            int counter = 1;    
            while (counter <= number) {
                factorial *= counter; 
                counter++;            
            }
            // Display the result
            System.out.println("The factorial of " + number + " is " + factorial + ".");
        }
    }
}
