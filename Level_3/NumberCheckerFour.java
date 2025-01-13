import java.util.ArrayList;

public class NumberCheckerFour {

    // Method to find factors of a number 
    public static int[] findFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList.stream().mapToInt(Integer::intValue).toArray();
    }

    // Method to find the greatest factor of a number
    public static int findGreatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors 
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors 
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors 
    public static long findProductOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = findSumOfFactors(factors) - number; 
        return sumOfProperDivisors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = findSumOfFactors(factors) - number; 
        return sumOfProperDivisors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = findSumOfFactors(factors) - number; 
        return sumOfProperDivisors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    
    private static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28; // Example number
        System.out.println("Number: " + number);

        // Find factors
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        // Find sum of factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

        // Find product of factors
        long productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

        // Find product of cubes of factors
        long productOfCubes = findProductOfCubesOfFactors(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);

        // Check if perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number: " + isPerfect);

        // Check if abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is Abundant Number: " + isAbundant);

        // Check if deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is Deficient Number: " + isDeficient);

        // Check if strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);
    }
}
