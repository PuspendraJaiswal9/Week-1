import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; 
            data[i][2] = weight / (heightInMeters * heightInMeters); 
        }
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; 
        String[] statuses = new String[10]; 

        // Input weight and height for 10 individuals
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Determine BMI statuses
        for (int i = 0; i < data.length; i++) {
            statuses[i] = getBMIStatus(data[i][2]);
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();
    }
}
