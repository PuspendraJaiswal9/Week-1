import java.util.Scanner;

public class TemperatureConversionFt {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable for Fahrenheit
        double fahrenheit;

        // Take input for Fahrenheit temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
    }
}
