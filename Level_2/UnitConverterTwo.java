import java.util.Scanner;

public class UnitConverterTwo {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println("Temperature in Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        // Pounds to Kilograms
        System.out.print("Enter weight in Pounds: ");
        double pounds = scanner.nextDouble();
        System.out.println("Weight in Kilograms: " + convertPoundsToKilograms(pounds));

        // Kilograms to Pounds
        System.out.print("Enter weight in Kilograms: ");
        double kilograms = scanner.nextDouble();
        System.out.println("Weight in Pounds: " + convertKilogramsToPounds(kilograms));

        // Gallons to Liters
        System.out.print("Enter volume in Gallons: ");
        double gallons = scanner.nextDouble();
        System.out.println("Volume in Liters: " + convertGallonsToLiters(gallons));

        // Liters to Gallons
        System.out.print("Enter volume in Liters: ");
        double liters = scanner.nextDouble();
        System.out.println("Volume in Gallons: " + convertLitersToGallons(liters));

        scanner.close();
    }
}
