package chaptersix.GuessingGame;

import java.util.Scanner;

import static chaptersix.GuessingGame.GuessingGame.*;

public class GuessingGameApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuessingGame.guess();
        int counter = 0;
        do {
            System.out.print("Guess a Number 1-1000:  ");
            userInput = scanner.nextInt();
            clue(guessedNumber, userInput);
            expression(counter, guessedNumber, userInput);
            GuessingGame.showGuessNumber(counter,guessedNumber,userInput);
            counter++;
            if(counter==13){
                System.exit(0);}
            }
        while (userInput != guessedNumber);
    }
    }

