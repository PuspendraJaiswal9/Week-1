import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Create an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0; 
        Scanner scanner = new Scanner(System.in);

        // Get input values for the heights from the user
        System.out.println("Enter the heights of 11 players in meters:");
        for (int i = 0; i < heights.length; i++) 
        {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; 
        }

        // Calculate the mean height
        double meanHeight = sum / heights.length;

        // Print the mean height
        System.out.printf("\nThe mean height of the football team is: %.2f meters\n", meanHeight);
    }
}
