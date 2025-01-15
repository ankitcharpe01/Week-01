import java.util.*;

public class CardsGame{

    // initializing the 
    static String[] initializeDeck(){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        
        for(String suit : suits){
            for(String rank : ranks){
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static void shuffleDeck(String[] deck){
        for(int i = 0; i < deck.length; i++){
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i)); // generating random card number.

            // shuffling
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // checking for distribution of cards
    static String[][] distributeCards(String[] deck, int n, int x){
        int cardsPerPlayer = n / x; // dividing cards equally.
        String[][] players = new String[x][cardsPerPlayer];
        int deckIndex = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }
        return players;
    }

    // printing all cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            System.out.println(Arrays.toString(players[i])); // printing whole arrray
            System.out.println(); // for next line
        }
    }
    // calling the methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // User input for number of cards and players
        System.out.print("Enter the number of cards to distribute:");
        int n = sc.nextInt();
        System.out.print("Enter the number of players:");
        int x = sc.nextInt();

        // Distribute the cards to players
        String[][] players = distributeCards(deck, n, x);

        // Print the players and their cards
        printPlayersCards(players);

        sc.close();
    }
}