import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter the marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter the marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter the marks for Maths: ");
        double maths = scanner.nextDouble();

        // Calculate the total and percentage
        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;

        // Calculate the grade based on percentage
        char grade;
        String remarks;

        if (percentage >= 90) {
            grade = 'A';
            remarks = "Excellent";
        } else if (percentage >= 75) {
            grade = 'B';
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Pass";
        } else {
            grade = 'F';
            remarks = "Fail";
        }

        // Output the average marks, grade, and remarks
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
