import java.util.Scanner;

public class CharacterFrequencyTwo {

    // Method to find the frequency 
    public static String[] findCharacterFrequency(String text) {
        // Convert string to character array
        char[] charArray = text.toCharArray();
        
        int[] frequency = new int[charArray.length];
        
        String[] result = new String[charArray.length];
        
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == '0') {
                continue;
            }
            
            frequency[i] = 1;
            
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i]++;
                    charArray[j] = '0';
                }
            }
            
            result[i] = charArray[i] + " -> " + frequency[i];
        }

        return result;
    }

    public static void displayCharacterFrequency(String[] result) {
        System.out.println("Character -> Frequency");
        for (String res : result) {
            if (res != null) {  
                System.out.println(res);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find the frequency of characters
        String[] result = findCharacterFrequency(text);

        // Display the result
        displayCharacterFrequency(result);

        sc.close();
    }
}
