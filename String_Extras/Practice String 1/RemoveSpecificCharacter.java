import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter character to remove: ");
        char toRemove = input.next().charAt(0);
        String result = "";

        // Build a new string without the specified character
        for (char ch : str.toCharArray()) {
            if (ch != toRemove) {
                result += ch;
            }
        }

        // Print the modified string
        System.out.println("Modified String: " + result);
    }
}
