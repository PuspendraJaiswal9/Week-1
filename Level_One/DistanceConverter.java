import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles
        double distanceInMiles = distanceInFeet / (3 * 1760);

        // Display the results
        System.out.printf("Distance in yards: %.2f yards%n", distanceInYards);
        System.out.printf("Distance in miles: %.5f miles%n", distanceInMiles);

    }
}
