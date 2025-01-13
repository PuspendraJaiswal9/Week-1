import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input month and day from the user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        // Check Spring season
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||  // March 20-31
                           (month == 4 && day >= 1 && day <= 30) ||   // April
                           (month == 5 && day >= 1 && day <= 31) ||   // May
                           (month == 6 && day >= 1 && day <= 20);     // June 1-20

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
