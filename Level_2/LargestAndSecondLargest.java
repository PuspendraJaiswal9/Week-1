import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take number input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store digits and set the max size to 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits from the number and store in the array
        while (number != 0) {
            if (index == maxDigit) {
                break;  // If the array size limit is reached, stop adding digits
            }
            digits[index] = number % 10;  // Extract the last digit
            number = number / 10;         // Remove the last digit
            index++;                      // Increment the index
        }

        // Now we need to find the largest and second-largest numbers
        int largest = -1;  // Initialize to a value lower than any digit (0-9)
        int secondLargest = -1;

        // Loop through the digits array to find the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i];     // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Output: Display the largest and second-largest digits
        if (largest != -1 && secondLargest != -1) {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("Not enough digits to determine the largest and second largest.");
        }

        scanner.close();
    }
}
