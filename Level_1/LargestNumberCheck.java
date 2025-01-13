import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Check if each number is the largest
        boolean isFirstLargest = (number1 > number2 && number1 > number3);
        boolean isSecondLargest = (number2 > number1 && number2 > number3);
        boolean isThirdLargest = (number3 > number1 && number3 > number2);

        // Print results
        System.out.println("Is the first number the largest? " + (isFirstLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (isSecondLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (isThirdLargest ? "Yes" : "No"));
    }
}
