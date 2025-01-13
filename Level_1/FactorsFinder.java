import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Input validation
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Initialize variables
        int maxFactor = 10; 
        int[] factors = new int[maxFactor];
        int index = 0; 

        // Find the factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
                if (index == maxFactor) { 
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor]; 
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; 
                }
                factors[index++] = i;             }
        }

        // Display the factors
        System.out.println("\nFactors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
