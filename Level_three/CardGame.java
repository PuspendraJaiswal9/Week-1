import java.util.*;

public class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        
        // Initialize the deck with "rank of suit"
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i); 
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck to players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards % numPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
            return null;
        }
        
        // Create a 2D array to store players and their cards
        String[][] playersCards = new String[numPlayers][numCards / numPlayers];
        int cardIndex = 0;
        
        // Distribute the cards to players
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards != null) {
            for (int i = 0; i < playersCards.length; i++) {
                System.out.println("Player " + (i + 1) + " has the following cards:");
                for (String card : playersCards[i]) {
                    System.out.println(card);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Initialize the deck
        String[] deck = initializeDeck();
        System.out.println("Deck initialized with " + deck.length + " cards.");

        // Step 2: Shuffle the deck
        deck = shuffleDeck(deck);
        System.out.println("Deck shuffled.");

        // Step 3: Get user input for number of players and cards per player
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter the number of cards to distribute to each player: ");
        int numCards = scanner.nextInt();

        // Step 4: Distribute the cards
        String[][] playersCards = distributeCards(deck, numCards * numPlayers, numPlayers);
        
        // Step 5: Print the cards of each player
        printPlayersCards(playersCards);
        
        scanner.close();
    }
}
