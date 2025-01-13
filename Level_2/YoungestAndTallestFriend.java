import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store age and height for the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + " in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // Update the index of the youngest
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; // Update the index of the tallest
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is " + getFriendName(youngestIndex) + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + getFriendName(tallestIndex) + " with height " + heights[tallestIndex] + " meters.");

        scanner.close();
    }

    // Helper method to get the name of the friend based on their index
    private static String getFriendName(int index) {
        switch (index) {
            case 0: return "Amar";
            case 1: return "Akbar";
            case 2: return "Anthony";
            default: return "Unknown";
        }
    }
}
