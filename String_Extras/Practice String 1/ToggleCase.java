import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        StringBuilder result = new StringBuilder();

        // Toggle the case of each character
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch)); // Convert to lowercase
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); // Convert to uppercase
            } else {
                result.append(ch); // Leave non-alphabetic characters unchanged
            }
        }

        // Print the modified string
        System.out.println("Toggled String: " + result);
    }
}
