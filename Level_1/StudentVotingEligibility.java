import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {
        // Create an array to store the ages of 10 students
        int[] ages = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Take input for the age of each student
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("\nVoting eligibility results:");
        // Loop through the array and check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age for student " + (i + 1) + ": " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }
}
