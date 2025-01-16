import java.util.Scanner;

public class UppercaseConversion {

    // Method to convert each character to uppercase using charAt()
    public static String convertToUppercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); 
            } else {
                result.append(ch); 
            }
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

        // Input the complete text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Convert text to uppercase using custom method
        String customUppercase = convertToUppercase(text);

        // Convert text to uppercase using String's built-in method
        String builtInUppercase = text.toUpperCase();

        // Compare the results using custom compare method
        boolean areEqual = compareStrings(customUppercase, builtInUppercase);

        // Display the results
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Custom Uppercase Conversion: " + customUppercase);
        System.out.println("Built-In Uppercase Conversion: " + builtInUppercase);
        System.out.println("Are the two results equal? " + (areEqual ? "Yes" : "No"));

        sc.close();
    }
}
