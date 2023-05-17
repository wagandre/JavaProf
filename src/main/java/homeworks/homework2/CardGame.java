package homeworks.homework2;

import java.util.Random;
import java.util.Scanner;


public class CardGame {
    Players players = new Players();
    Cards cards = new Cards();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        cardGame.startGame();
    }
    public void startGame() {
        cards.deckInitialization();
        players.playerInitialization();
        cards.getShuffling();
        players.showTheShuffledDeck(cards.getDeck());
    }
}
