package assessment.guessGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many player would love to play?");
        int noOfPlayer = scanner.nextInt();
        GuessGame game = new GuessGame(noOfPlayer);

        for (int i = 0; i < noOfPlayer; i++) {
            System.out.println("Player "+(i+1)+", enter your name");
            String name = scanner.next();
            game.registerPlayer(name);
        }

        game.generateRandomNumber();

        while (!game.isWon()){
            System.out.println(game.getCurrentPlayerName() + ", its your turn. Guess a number between 1 and 20");
            int guess = scanner.nextInt();
            try {
                System.out.println(game.play(guess));
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
