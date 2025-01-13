import java.util.Scanner;

public class RocketLaunchCountdownFor {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input 
        System.out.print("Enter the starting value for the countdown: ");
        int counter = scanner.nextInt();

        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print the current counter value
        }
    }
}
