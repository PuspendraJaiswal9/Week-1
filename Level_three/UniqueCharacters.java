import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string without using length() method
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                char c = text.charAt(length); 
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch exception when we exceed the length of the string
        }
        return length;
    }

    // Method to find unique characters using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text); 
        boolean[] seen = new boolean[length]; 
        char[] uniqueChars = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);

            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[index] = currentChar;
                index++;
            }
        }

        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        if (uniqueChars.length == 0) {
            System.out.println("No unique characters found.");
        } else {
            System.out.print("Unique characters: ");
            for (char c : uniqueChars) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the result
        displayUniqueCharacters(uniqueChars);

        sc.close();
    }
}
