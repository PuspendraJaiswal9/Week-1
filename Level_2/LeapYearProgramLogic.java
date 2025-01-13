import java.util.Scanner;

public class LeapYearProgramLogic {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input year from the user
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582 (Gregorian calendar).");
        } else {
            // Check for leap year 
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
