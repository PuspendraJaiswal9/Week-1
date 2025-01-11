import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for name, cities, and distances
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the intermediate city (viaCity): ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city (toCity): ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();

        // Calculate total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        // Display output
        System.out.println(name + " traveled from " + fromCity + " -> " + viaCity + " -> " + toCity +
                           " covering a total distance of " + totalDistance + " miles in " + timeTaken +
                           " hours with an average speed of " + averageSpeed + " miles/hour.");
    }
}
