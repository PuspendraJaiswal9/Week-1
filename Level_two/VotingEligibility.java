import java.util.Scanner;

public class VotingEligibility {

    // Method to check voting eligibility based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]); // Age as String
            if (ages[i] < 0) {
                eligibility[i][1] = "Invalid Age"; // Invalid age
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can Vote"; // Can vote
            } else {
                eligibility[i][1] = "Cannot Vote"; // Cannot vote
            }
        }
        return eligibility;
    }

    // Method to display the 2D array in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        System.out.printf("%-10s %-15s\n", "Age", "Eligibility");
        System.out.println("-----------------------------");
        for (String[] row : eligibility) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for 10 students' ages
        int numberOfStudents = 10;
        int[] ages = new int[numberOfStudents];

        // Input for student ages
        System.out.println("Enter the age of " + numberOfStudents + " students:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the results
        displayEligibility(eligibility);

        sc.close();
    }
}
