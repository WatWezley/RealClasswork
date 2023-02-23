package assessment.guessGame;

import java.security.SecureRandom;

public class GuessGame {

    private Player [] players;
    private int currentPlayer = 0;
    private int luckyNumber;
    private boolean isWon;

    public GuessGame(int noOfPlayer){
        players = new Player[noOfPlayer];
    }

    public void registerPlayer(String name){
        players[currentPlayer] = new Player(name);
        resetCurrentPlayer();
    }

    private void resetCurrentPlayer() {
        currentPlayer++;
        if (currentPlayer == players.length){
            currentPlayer = 0;
        }
    }

    public void generateRandomNumber(){
        SecureRandom random = new SecureRandom();
        luckyNumber = 1 + random.nextInt(20);
    }

    public String play(int guess){
        validateInput(guess);
        return confirmWinning(guess);
    }

    public String confirmWinning(int guess) {
        if (guess < luckyNumber) return lowGuess();
        else if (guess > luckyNumber) return highGuess();
        else return processWinning();
    }

    private String processWinning() {
        String name = players[currentPlayer].getName();
        resetCurrentPlayer();
        isWon = true;
        return String.format("Congratulation %s, you won!", name);
    }

    private String highGuess() {
        resetCurrentPlayer();
        return "Your guess is too high! Try again";
    }

    private String lowGuess() {
        resetCurrentPlayer();
        return "Your guess is too low! Try again";
    }

    private void validateInput(int guess) {
        if (guess > 20 || guess < 1){
            throw new IllegalArgumentException("Guess must be between 1 and 20");
        }
    }

    public boolean isWon(){
        return isWon;
    }

    public String getCurrentPlayerName() {
        return players[currentPlayer].getName();
    }
}
