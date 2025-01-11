import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert weight from pounds to kilograms (1 pound = 2.2 kg)
        double weightInKilograms = weightInPounds * 2.2;

        // Print result 
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKilograms);

    }
}
