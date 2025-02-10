import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        // Sort characters of both strings
        char[] chars1 = str1.replaceAll("\\s", "").toCharArray();
        char[] chars2 = str2.replaceAll("\\s", "").toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare the sorted strings
        if (Arrays.equals(chars1, chars2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
