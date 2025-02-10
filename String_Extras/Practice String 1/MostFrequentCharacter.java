import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        HashMap<Character, Integer> frequency = new HashMap<>();
        char mostFrequent = '\0';
        int maxCount = 0;

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            if (frequency.get(ch) > maxCount) {
                maxCount = frequency.get(ch);
                mostFrequent = ch;
            }
        }

        // Print the most frequent character
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
