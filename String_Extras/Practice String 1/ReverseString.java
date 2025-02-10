import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String reversed = "";

        // Loop through the string in reverse
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character to the result
        }

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }
}
