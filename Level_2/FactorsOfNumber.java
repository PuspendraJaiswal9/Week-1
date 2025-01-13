import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  
                System.out.println(i);  
            }
        }
    }
}
