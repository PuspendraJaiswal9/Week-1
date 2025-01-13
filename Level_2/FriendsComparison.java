import java.util.Scanner;

public class FriendsComparison {

    // Method 
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    // Method 
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Array to store the ages of the friends
        int[] ages = new int[3];

        // Array to store the heights of the friends
        double[] heights = new double[3];

        // Taking input for ages and heights
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest friend
        String youngest = findYoungest(names, ages);

        // Finding the tallest friend
        String tallest = findTallest(names, heights);

        // Displaying the results
        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
