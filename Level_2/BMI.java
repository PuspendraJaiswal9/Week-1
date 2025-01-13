import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the weight and height from the user
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();

        // Convert height from centimeters to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (heightInMeters * heightInMeters);

        // Output the BMI result
        System.out.println("Your BMI is: " + bmi);

        // Determine the weight status based on the BMI value
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
