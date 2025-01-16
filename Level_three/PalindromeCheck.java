import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

   
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];
        
        // Reverse the string
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - i - 1];
        }
        
        
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string to check for palindrome: ");
        String text = sc.nextLine();

        // Remove spaces and convert to lowercase for case-insensitive comparison
        text = text.replaceAll("\\s+", "").toLowerCase();

        if (isPalindromeIterative(text)) {
            System.out.println("The text is a palindrome (Iterative check).");
        } else {
            System.out.println("The text is NOT a palindrome (Iterative check).");
        }

        if (isPalindromeRecursive(text, 0, text.length() - 1)) {
            System.out.println("The text is a palindrome (Recursive check).");
        } else {
            System.out.println("The text is NOT a palindrome (Recursive check).");
        }

        if (isPalindromeUsingArray(text)) {
            System.out.println("The text is a palindrome (Array check).");
        } else {
            System.out.println("The text is NOT a palindrome (Array check).");
        }

        sc.close();
    }
}
