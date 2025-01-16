import java.util.Scanner;

public class CalendarApp {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month using the Gregorian calendar formula
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        
        if (m <= 2) {
            m += 12;
            y--;
        }
        
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;  
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the calendar header
        System.out.println("      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Add space for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); 
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input month and year from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        scanner.close();
    }
}
