import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String result = "";

        // Iterate through the string
        for (char ch : str.toCharArray()) {
            // Append the character if it's not already in the result
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        // Print the modified string
        System.out.println("String after removing duplicates: " + result);
    }
}
