import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            // Calculate the bonus 
            double bonus = salary * 0.05;
            System.out.println("The employee's bonus is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
