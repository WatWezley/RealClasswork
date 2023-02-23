package chaptersix.GuessingGame;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner scanner = new Scanner(System.in);

    static int guessedNumber;
    static int userInput;

    static int counter;

    static String response;


    public void setUserInput() {
        do {
            System.out.print("Guess a Number 1-1000:  ");
            userInput = scanner.nextInt();
            clue(guessedNumber, userInput);
            expression(counter, guessedNumber, userInput);
        }
        while (userInput != guessedNumber);
    }

    public static void guess() {
        guessedNumber = 1 + randomNumbers.nextInt(1000);
    }

    public static String clue(int guessedNumber, int userInput) {
        if (userInput < guessedNumber) {
            response = "Too low, try again.";}
        if (userInput > guessedNumber) {
            response = "Too high, try again.";}
       // if (userInput == guessedNumber){
         //   response = "You guessed it right";}
        System.out.println(response);
        return response;
    }


    public static String expression(int counter, int guessedNumber, int userInput) {
        String response2 = "";
        if (counter >= 10) {
            response2 = "You should be able to do better.";
            System.out.println(response2);
        }
        if (counter <= 10 && userInput == guessedNumber) {
            response2 = "Either you know the truth or you got lucky.\"CONGRATULATION.";
            System.out.println(response2);
        }
        return response2;

    }

    public static int showGuessNumber(int counter,int guessedNumber,int userInput){
        if (counter == 12 && userInput!=guessedNumber){
            System.out.println("Sorry your chances to guess are exhausted");
            System.out.println("The guessed number is "+ guessedNumber);
        }
        return guessedNumber;

    }
}



