import java.util.Scanner;

public class StringToCharArrayComparison {
    // Method to return all characters in a string as a char array
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i); 
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false; 
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false; 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Get characters using user-defined method
        char[] charsByMethod = getChars(text);

        // Get characters using built-in toCharArray() method
        char[] charsByToCharArray = text.toCharArray();

        // Compare the two char arrays
        boolean comparisonResult = compareCharArrays(charsByMethod, charsByToCharArray);

        // Display results
        System.out.println("Characters using user-defined method: " + new String(charsByMethod));
        System.out.println("Characters using toCharArray(): " + new String(charsByToCharArray));
        System.out.println("Are both arrays equal? " + comparisonResult);

        sc.close();
    }
}
