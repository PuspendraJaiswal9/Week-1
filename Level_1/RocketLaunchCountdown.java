import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take Input 
        System.out.print("Enter the starting value for the countdown: ");
        int counter = scanner.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter); // Print the current counter value
            counter--; // Decrement the counter
        }
    }
}
