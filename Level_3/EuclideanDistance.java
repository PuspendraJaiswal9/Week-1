import java.util.Scanner;

class EuclideanDistance {
    // Create Method For calculating Distance
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    //Create Method For Calculating Line Equation
    public static double[] calculateLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[] { slope, intercept };
    }

    public static void main(String[] args) {
        //Create Scanner object for user input.
        Scanner input = new Scanner(System.in);

        //take User input
        int x1 = input.nextInt(), y1 = input.nextInt();
        int x2 = input.nextInt(), y2 = input.nextInt();

        //Calculate Distance.
        double distance = calculateDistance(x1, y1, x2, y2);
        double[] equation = calculateLineEquation(x1, y1, x2, y2);

        //Display output.
        System.out.println("Euclidean Distance: " + distance);
        System.out.println("Equation of line: y = " + equation[0] + "x + " + equation[1]);
    }
}
