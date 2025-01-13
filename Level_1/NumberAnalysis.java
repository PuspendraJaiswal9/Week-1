import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        // Create an array to store 5 numbers
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Take user input for the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nNumber analysis results:");
        // Analyze each number in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("The number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } else {
                System.out.println("The number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        System.out.println("\nComparison of the first and last elements:");
        if (firstElement == lastElement) {
            System.out.println("The first element (" + firstElement + ") is equal to the last element (" + lastElement + ").");
        } else if (firstElement > lastElement) {
            System.out.println("The first element (" + firstElement + ") is greater than the last element (" + lastElement + ").");
        } else {
            System.out.println("The first element (" + firstElement + ") is less than the last element (" + lastElement + ").");
        }
    }
}
