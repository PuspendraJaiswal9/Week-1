import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle in square inches
        double areaInInches = 0.5 * base * height;

        // Convert the area from square inches to square centimeters
        double areaInCentimeters = areaInInches * 6.4516;  // 1 square inch = 6.4516 square centimeters

        // Display the results
        System.out.printf("Area of the triangle: %.2f square inches%n", areaInInches);
        System.out.printf("Area of the triangle: %.2f square centimeters%n", areaInCentimeters);
    }
}
