import java.util.Arrays;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000); 
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum of an array
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomValues randomValues = new RandomValues();

        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = randomValues.generate4DigitRandomArray(5);

        // Find the average, minimum, and maximum
        double[] results = randomValues.findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
