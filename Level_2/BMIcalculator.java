import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Create arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        // Loop to input weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input weight and height
            System.out.print("Enter weight (in kg): ");
            weight[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters): ");
            height[i] = scanner.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        // Display the results
        System.out.println("\nBMI Results:");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height", "Weight", "BMI", "Status");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), height[i], weight[i], bmi[i], status[i]);
        }

        scanner.close();
    }
}
