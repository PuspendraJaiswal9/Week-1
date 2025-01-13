import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get an integer input for the multiplication table
        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the results for multiplication from 6 to 9
        int[] multiplicationResult = new int[4]; 

        // Calculate the multiplication table for numbers from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; 
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
