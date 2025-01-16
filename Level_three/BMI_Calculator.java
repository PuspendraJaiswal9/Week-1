import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI and status
    public static String[] calculateBMI(double weight, double height) {
        double heightInMeters = height / 100;  // Convert height from cm to meters
        double bmi = weight / (heightInMeters * heightInMeters);  // BMI formula

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }

        // Return an array with the weight, height, bmi, and status
        return new String[]{String.valueOf(weight), String.valueOf(height), String.format("%.2f", bmi), status};
    }

    // Method to process all the team members
    public static String[][] processTeam(int n, Scanner sc) {
        String[][] data = new String[n][4];  

        // Input for 10 members
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Get weight and height
            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            double height = sc.nextDouble();

            // Calculate BMI and status
            String[] bmiData = calculateBMI(weight, height);

            // Store the data
            data[i][0] = bmiData[0];  // weight
            data[i][1] = bmiData[1];  // height
            data[i][2] = bmiData[2];  // bmi
            data[i][3] = bmiData[3];  // status
        }

        return data;
    }

    // Method to display the 2D array in tabular format
    public static void displayData(String[][] data) {
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI   | Status");
        System.out.println("--------------------------------------------------------");

        // Display each person's data
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-7d| %-12s| %-13s| %-6s| %-8s\n", i + 1, data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teamSize = 10;  // Number of team members

        // Process the team members' data
        String[][] teamData = processTeam(teamSize, sc);

        // Display the results
        displayData(teamData);

        sc.close();
    }
}
