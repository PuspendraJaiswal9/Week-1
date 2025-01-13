import java.util.Scanner;

public class BMIcalculatorSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Create a multi-dimensional array to store weight, height, and BMI for each person
        // personData[i][0] -> height, personData[i][1] -> weight, personData[i][2] -> BMI
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        // Loop to input weight and height for each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input weight and height, ensure they are positive
            double weight, height;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (weight <= 0);  // Loop until valid input

            do {
                System.out.print("Enter height (in meters): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (height <= 0);  // Loop until valid input

            // Store weight and height in the personData array
            personData[i][0] = height;
            personData[i][1] = weight;

            // Calculate BMI and store in the array
            personData[i][2] = weight / (height * height);

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the results
        System.out.println("\nBMI Results:");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height", "Weight", "BMI", "Status");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
