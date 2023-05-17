package homeworks.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static homeworks.homework3.Constants.MOVE_CHANGE_TIME;


public class SeaBattle {

    private static List<Player> players = new ArrayList<>();
    public static boolean isGameOver;
    private static Player winner;

    public static void main(String[] args) {

        System.out.println("Игра \"Морской бой\".\n");

        createPlayers();
        fillGameFields();
        game();
        showWinner();
    }

    private static void createPlayers() {
        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("Игрок 1, пожалуйста, введите своё имя.");
            name = scanner.nextLine();
        } while (name.isEmpty());

        players.add(new Player(name, new Field()));
        System.out.println();

        do {
            System.out.println("Игрок 2, пожалуйста, введите своё имя.");
            name = scanner.nextLine();
        } while (name.isEmpty());

        players.add(new Player(name, new Field()));
        System.out.println();
    }

    private static void fillGameFields() {
        for (Player player : players) {
            System.out.printf("%s, через %d секунд начнётся заполнение Вашего поля.\n" +
                            "%s, пожалуйста, не смотрите в экран.\n\n",
                    player.getName(), MOVE_CHANGE_TIME / 1000, getAnotherPlayer(player).getName());

            changeMovePause();
            player.fillGameField();
        }
    }

    private static void game() {
        while (!isGameOver) {

            for (Player player : players) {
                System.out.printf("%s, через %d секунд начнётся Ваш ход.\n" +
                                "%s, пожалуйста, не смотрите в экран.\n\n",
                        player.getName(), MOVE_CHANGE_TIME / 1000, getAnotherPlayer(player).getName());

                changeMovePause();
                player.getField().repaint(false);
                makeMove(player);

                if (isGameOver) {
                    break;
                }
            }
        }
    }

    private static void makeMove(Player player) {
        boolean isMoveComplete = false;

        while (!isMoveComplete) {
            isMoveComplete = player.makeShot(getAnotherPlayer(player).getField());
        }

        if (isGameOver) {
            winner = player;
        }
    }

    private static void showWinner() {
        System.out.printf("Победил %s!\n", winner.getName());
    }

    private static Player getAnotherPlayer(Player currentPlayer) {
        Player result = null;
        for (Player player : players) {
            if (!currentPlayer.equals(player)) {
                result = player;
            }
        }
        return result;
    }

    private static void changeMovePause() {
        try {
            Thread.sleep(MOVE_CHANGE_TIME);
        } catch (InterruptedException ignored) {
        }
    }
}