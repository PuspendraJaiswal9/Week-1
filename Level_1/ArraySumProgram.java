import java.util.Scanner;

public class ArraySumProgram {
    public static void main(String[] args) {
        // Create an array to store up to 10 numbers
        double[] numbers = new double[10];
        double total = 0.0; 
        int index = 0;     
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Break the loop if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Break the loop if the array is full
            if (index == 10) {
                System.out.println("Array is full. Cannot add more numbers.");
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Display all the numbers entered by the user
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; // Add each number to the total
        }

        // Display the total sum
        System.out.println("\nTotal sum of numbers: " + total);
    }
}
