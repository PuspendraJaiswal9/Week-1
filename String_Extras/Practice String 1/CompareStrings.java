import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        // Compare strings lexicographically
        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" lexicographically.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" lexicographically.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}
