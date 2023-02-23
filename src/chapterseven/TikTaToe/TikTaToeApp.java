package chapterseven.TikTaToe;

import javax.swing.*;
import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

public class TikTaToeApp {


    static TikTaToe tikTaToe = new TikTaToe(2);
    static Scanner scanner = new Scanner(System.in);
    static int noOfPlayers = 2;

    static int input = 0;


    public static void main(String[] args) {


        for (int n = 0; n < noOfPlayers; n++) {
            String name = input("Enter your name: ");
            tikTaToe.registerPlayer(name);
        }
        while ((!tikTaToe.isWon())) {
            positionChoice();

        }

    }


    public static void positionChoice() {
        for (int n = 0; n < noOfPlayers; n++) {
            String name = tikTaToe.getCurrentPlayerName();
            try {
                input = Integer.parseInt(input(name + " Enter your choice of Position(0-8):"));
                validateInputType(input);
            }

            catch (IllegalArgumentException ex){
                display("Wrong Format, enter (0-8)");
                positionChoice();}

            try {
                tikTaToe.play(input);
            } catch (DuplicateFormatFlagsException ex) {
                display("Choice already need");
                positionChoice();}
        }
    }

    public static void validateInputType(int input){
        if(input<0 &&input>8) throw new IllegalArgumentException("Wrong Format, enter (0-8)");

    }
    private static String input(String Prompt) {
        return JOptionPane.showInputDialog(Prompt);

    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);

    }
}
