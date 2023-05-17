package homeworks.homework2;

import java.util.Scanner;

public class Players {
    final Scanner scanner = new Scanner(System.in);
    Cards cards = new Cards();
    private int NUMBER_OF_PLAYERS;


    public void setNumberOfPlayers(int numberOfPlayers) {
        this.NUMBER_OF_PLAYERS = numberOfPlayers;
    }

    public int getNumberOfPlayers() {
        return NUMBER_OF_PLAYERS;
    }

    public void playerInitialization() {
        while (true) {
            System.out.println("Enter the number of players");
            if (scanner.hasNextInt()) {
                NUMBER_OF_PLAYERS = scanner.nextInt();


                if (cards.getCARDS_FOR_PLAYERS() * NUMBER_OF_PLAYERS <= cards.getNumberOfCards()) {
                    break;
                } else {
                    if (NUMBER_OF_PLAYERS == 0) {
                        System.out.println("The game has been terminated");
                        break;
                    } else if (NUMBER_OF_PLAYERS < 0) {
                        System.out.println("The number of players cannot be less than 0");
                        break;
                    } else {
                        System.out.println("Too many players!");
                        break;
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }
    }

    public void showTheShuffledDeck(String [] deck) {
        for (int i = 0; i < NUMBER_OF_PLAYERS * cards.getCARDS_FOR_PLAYERS(); i++) {
            System.out.println(deck[i]);

            if (i % cards.getCARDS_FOR_PLAYERS() == cards.getCARDS_FOR_PLAYERS() - 1)
                System.out.println();
        }
    }
}
