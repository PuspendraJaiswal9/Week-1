import java.util.Scanner;

public class CalendarDisplay {

    // Array to store the names of the months
    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month and year
    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7; // Returns 0 for Sunday, 1 for Monday, etc.
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n    " + MONTHS[month - 1] + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        int firstDay = getFirstDayOfMonth(year, month); // Get the first day of the month
        int numberOfDays = getNumberOfDays(month, year); // Get the number of days in the month

        // Print leading spaces for the first row
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0 || day == numberOfDays) {
                System.out.println(); // Move to the next line after Saturday or the last day
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate the input
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid month or year. Please try again.");
        } else {
            // Display the calendar
            displayCalendar(month, year);
        }

        scanner.close();
    }
}
