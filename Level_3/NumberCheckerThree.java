public class NumberCheckerThree {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // Prime numbers are greater than 1
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Divisible by other than 1 and itself
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr); // Check if square ends with the number itself
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7; // Divisible by 7 or ends with 7
    }

    public static void main(String[] args) {
        int number = 25; // Example number
        System.out.println("Number: " + number);

        // Check if prime
        boolean isPrimeNumber = isPrime(number);
        System.out.println("Is Prime: " + isPrimeNumber);

        // Check if neon
        boolean isNeon = isNeonNumber(number);
        System.out.println("Is Neon: " + isNeon);

        // Check if spy
        boolean isSpy = isSpyNumber(number);
        System.out.println("Is Spy: " + isSpy);

        // Check if automorphic
        boolean isAutomorphic = isAutomorphicNumber(number);
        System.out.println("Is Automorphic: " + isAutomorphic);

        // Check if buzz
        boolean isBuzz = isBuzzNumber(number);
        System.out.println("Is Buzz: " + isBuzz);
    }
}
