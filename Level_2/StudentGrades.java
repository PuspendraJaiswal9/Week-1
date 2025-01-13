import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Arrays to store marks, percentages, and grades
        double[][] marks = new double[numStudents][3]; // For storing marks of Physics, Chemistry, and Maths
        double[] percentages = new double[numStudents]; // For storing percentage
        String[] grades = new String[numStudents]; // For storing grade

        // Loop to input marks and calculate percentage and grade
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Input for Physics, Chemistry, and Maths marks
            double physics, chemistry, maths;
            do {
                System.out.print("Enter Physics marks: ");
                physics = scanner.nextDouble();
                if (physics < 0) {
                    System.out.println("Marks must be positive. Please enter again.");
                }
            } while (physics < 0);

            do {
                System.out.print("Enter Chemistry marks: ");
                chemistry = scanner.nextDouble();
                if (chemistry < 0) {
                    System.out.println("Marks must be positive. Please enter again.");
                }
            } while (chemistry < 0);

            do {
                System.out.print("Enter Maths marks: ");
                maths = scanner.nextDouble();
                if (maths < 0) {
                    System.out.println("Marks must be positive. Please enter again.");
                }
            } while (maths < 0);

            // Store the marks in the array
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            // Calculate the percentage
            double totalMarks = physics + chemistry + maths;
            percentages[i] = (totalMarks / 300) * 100; // Total marks are out of 300

            // Determine the grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B+";
            } else if (percentages[i] >= 60) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else if (percentages[i] >= 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        // Display the results
        System.out.println("\nStudent Marks, Percentage, and Grades:");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}
