import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array (Matrix) with the given rows and columns
        int[][] matrix = new int[rows][columns];

        // Take input for elements of the 2D array (Matrix)
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * columns];

        // Copy elements from the 2D array to the 1D array
        int index = 0; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];             }
        }

        // Display the original 2D array
        System.out.println("\nThe 2D Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the copied 1D array
        System.out.println("\nThe 1D Array after copying elements from the 2D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
