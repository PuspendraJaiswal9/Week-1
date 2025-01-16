import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Accessing invalid index: " + names[10]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        // Create and populate the array
        String[] names = new String[size];
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException...");
        try {
            generateException(names); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");
        handleException(names); 

        sc.close();
    }
}
