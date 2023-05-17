package homeworks.homework2;

import java.util.Random;

public class Cards {
    final Random random = new Random();
    private final int CARDS_FOR_PLAYERS = 5;
    private final String[] SUITS = {"clubs", "diamonds", "hearts", "spades"};
    private final String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private String[] deck;

    private final int NUMBER_OF_CARDS = SUITS.length * RANK.length; // number of cards


    public String[] getDeck() {
        return deck;
    }

    public void setDeck(String[] deck) {
        this.deck = deck;
    }

    public int getCARDS_FOR_PLAYERS() {
        return CARDS_FOR_PLAYERS;
    }

    public String[] getSUITS() {
        return SUITS;
    }

    public String[] getRANK() {
        return RANK;
    }

    public int getNumberOfCards() {
        return NUMBER_OF_CARDS;
    }

    public void deckInitialization() {
        deck = new String[NUMBER_OF_CARDS];
        for (int i = 0; i < RANK.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANK[i] + " " + SUITS[j];
            }
        }
    }

    public void getShuffling() {
        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            int card = i + (random.nextInt(NUMBER_OF_CARDS - i));
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }
}

