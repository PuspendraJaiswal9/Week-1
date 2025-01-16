import java.util.Scanner;

public class StudentGrade {

    // Method to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input marks of 3 subjects
        System.out.print("Enter marks for Physics: ");
        double physicsMarks = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistryMarks = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = sc.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;

        // Calculate grade based on percentage
        String grade = calculateGrade(percentage);

        // Display the result
        System.out.println("Total Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
