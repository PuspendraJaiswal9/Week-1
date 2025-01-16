import java.util.Scanner;

public class SubstringComparison {
    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i)); 
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false; 
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false; 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string and indices
        System.out.print("Enter the main string: ");
        String text = sc.next();
        System.out.print("Enter the start index: ");
        int start = sc.nextInt();
        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        // Create substring using charAt()
        String substringByCharAt = createSubstring(text, start, end);

        // Create substring using built-in method
        String substringByBuiltIn = text.substring(start, end);

        // Compare the substrings
        boolean comparisonResult = compareStrings(substringByCharAt, substringByBuiltIn);

        // Display results
        System.out.println("Substring using charAt(): " + substringByCharAt);
        System.out.println("Substring using substring(): " + substringByBuiltIn);
        System.out.println("Are both substrings equal? " + comparisonResult);

        sc.close();
    }
}
