import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input number is positive
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return; // Exit the program if the number is not positive
        }

        // Create a String array to store the results
        String[] results = new String[number + 1];

        // Loop through numbers from 0 to the entered number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz"; 
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; 
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; 
            } else {
                results[i] = Integer.toString(i); 
            }
        }

        // Display the results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
    }
}
