//import two pkgs 
import java.util.Random;
import java.util.Scanner;

class StudentScores {

    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 30 + rand.nextInt(71);  // Random marks for Physics (between 30 and 100)
            scores[i][1] = 30 + rand.nextInt(71);  // Random marks for Chemistry (between 30 and 100)
            scores[i][2] = 30 + rand.nextInt(71);  // Random marks for Maths (between 30 and 100)
        }
        return scores;
    }

    public static double[][] calculateScores(int[][] scores) {
        double[][] results = new double[scores.length][4];  // Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;  // Rounding to 2 decimals
            results[i][2] = Math.round(percentage * 100.0) / 100.0;  // Rounding to 2 decimals
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f\n",
                i + 1, scores[i][0], scores[i][1], scores[i][2],
                results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateScores(scores);
        displayScorecard(scores, results);
    }
}
