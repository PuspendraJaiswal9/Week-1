import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get an integer input for the multiplication table
        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the results of the multiplication table
        int[] multiplicationTable = new int[10];

        // Calculate the multiplication table and store it in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i; // Store results in the array
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
    }
}
