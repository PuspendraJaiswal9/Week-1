import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for salary and bonus
        double salary, bonus;

        // Take input for salary
        System.out.print("Enter your salary (INR): ");
        salary = scanner.nextDouble();

        // Take input for bonus
        System.out.print("Enter your bonus (INR): ");
        bonus = scanner.nextDouble();

        // Compute the total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);
    }
}
