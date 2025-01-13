import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("The multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) 
            {  
                System.out.println(i); 
            }
        }
    }
}
