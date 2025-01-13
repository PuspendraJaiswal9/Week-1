import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number < 1) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            // Iterate from 1 to the user-entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}
