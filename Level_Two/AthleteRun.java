import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the sides of the triangular park
        System.out.print("Enter the length of the first side of the park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side of the park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side of the park (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3; 

        // Convert the total running distance to meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds needed 
        int rounds = (int) Math.ceil(totalDistance / perimeter);

        // Display output.
        System.out.println("The perimeter of the triangular park is " + perimeter + " meters, and the athlete needs to complete " + rounds + " rounds to cover 5 km.");
    }
}
