import java.util.Scanner;

public class StringTrimExample {

    // Method to find the starting and ending points with no spaces
    public static int[] findTrimPoints(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        // Find trim points
        int[] trimPoints = findTrimPoints(text);
        int start = trimPoints[0];
        int end = trimPoints[1];

        // Trim spaces using user-defined method
        String trimmedUserDefined = createSubstring(text, start, end);

        // Trim spaces using built-in trim() method
        String trimmedBuiltIn = text.trim();

        // Compare the results
        boolean isSame = compareStrings(trimmedUserDefined, trimmedBuiltIn);

        // Display the results
        System.out.println("Original Text: \"" + text + "\"");
        System.out.println("Trimmed Text (User-Defined): \"" + trimmedUserDefined + "\"");
        System.out.println("Trimmed Text (Built-In): \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both trimmed texts the same? " + isSame);

        sc.close();
    }
}
