import java.util.Arrays;

public class NumberCheckerOne {

    // Method to find the count of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2); // Square of each digit
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0; // Check divisibility
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 rows (for digits 0-9), 2 columns (digit and frequency)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Initialize the digit column
        }
        for (int digit : digits) {
            frequency[digit][1]++; // Increment the frequency column
        }
        return frequency;
    }

    public static void main(String[] args) {
        int number = 21; 
        System.out.println("Number: " + number);

        // Count of digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Sum of squares of digits
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Frequency of each digit
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) { // Only print digits with non-zero frequency
                System.out.println("Digit: " + frequency[i][0] + ", Frequency: " + frequency[i][1]);
            }
        }
    }
}
