import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is less than 2 
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                   if (number % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
            // Check and display the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
