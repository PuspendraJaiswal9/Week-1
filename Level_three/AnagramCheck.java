import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();
        
        
        if (text1.length() != text2.length()) {
            return false;
        }
        
        // Create arrays to store frequency of characters
        int[] frequency1 = new int[256]; 
        int[] frequency2 = new int[256]; 

        // Find the frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Check if the texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are NOT anagrams.");
        }

        sc.close();
    }
}
