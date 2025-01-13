import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Input month, day, and year from the user
        Scanner scanner = new Scanner(System.in);

        // Taking the month, day, and year as input
        System.out.print("Enter the month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int d = scanner.nextInt();
        System.out.print("Enter the year: ");
        int y = scanner.nextInt();

        // Calculating y using the formula
        int y0 = y - (14 - m) / 12;

        // Calculating x using the formula
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculating m0 using the formula
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculating d0 using the formula
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Printing the result
        System.out.println("The day of the week is: " + d0);
    }
}
