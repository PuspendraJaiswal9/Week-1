import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the age and height of Amar
        System.out.print("Enter the age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        double heightAmar = scanner.nextDouble();

        // Input the age and height of Akbar
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        double heightAkbar = scanner.nextDouble();

        // Input the age and height of Anthony
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        double heightAnthony = scanner.nextDouble();

        // Find the youngest friend (smallest age)
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend (largest height)
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Output the youngest and tallest friends
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");
    }
}
