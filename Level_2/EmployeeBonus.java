import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the salary, years of service, bonus, and new salary for each employee
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store the total bonus payout, total old salary, and total new salary
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Loop to take input from the user for salary and years of service
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;

            // Taking valid input for salary and years of service
            while (!validInput) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = scanner.nextDouble();

                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextInt();

                // Validate salary and years of service
                if (salary[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input. Please enter positive values for salary and years of service.");
                } else {
                    validInput = true;
                }
            }
        }

        // Loop to calculate the bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            // Calculate new salary by adding the bonus
            newSalary[i] = salary[i] + bonus[i];

            // Accumulate the total bonus, total old salary, and total new salary
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print the results
        System.out.println("\n--- Employee Bonus and Salary Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println();
        }

        // Print the total values
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
