import java.util.Scanner;

public class LowercaseConversion {

    // Method to convert each character to lowercase using charAt()
    public static String convertToLowercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32)); 
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

        // Convert text to lowercase using custom method
        String customLowercase = convertToLowercase(text);

        // Convert text to lowercase using String's built-in method
        String builtInLowercase = text.toLowerCase();

        // Compare the results using custom compare method
        boolean areEqual = compareStrings(customLowercase, builtInLowercase);

        // Display the results
        System.out.println("\nOriginal Text: " + text);
        System.out.println("Custom Lowercase Conversion: " + customLowercase);
        System.out.println("Built-In Lowercase Conversion: " + builtInLowercase);
        System.out.println("Are the two results equal? " + (areEqual ? "Yes" : "No"));

        sc.close();
    }
}
