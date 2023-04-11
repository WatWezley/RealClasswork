package chapterseven.TikTaToe;

import assessment.guessGame.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.Objects;

import static java.awt.Color.blue;
import static java.awt.Color.green;

public class TikTaToe {
    Player[] players;

    String[][] tikTaToeBoard = new String[3][3];

   ArrayList<Integer>inputs =new ArrayList<Integer>();
    private int currentPlayer = 0;

    private int noOfPlayers;

    String playerMarker = "X";

    int count = 0;
    private int input;
    private boolean isWon;

    public TikTaToe(int noOfPlayers) {
        players = new Player[noOfPlayers];
    }

    public void registerPlayer(String name) {
        players[currentPlayer] = new Player(name);
        resetCurrentPlayer();
    }

    public void resetCurrentPlayer() {
        currentPlayer++;
        if (currentPlayer == players.length) {
            currentPlayer = 0;
        }
    }

    public void processingPosition(int userInput) {
        validatePosition(userInput);
        int row = userInput / 3;
        int column = userInput % 3;
        tikTaToeBoard[row][column] = playerMarker;
        storePosition(userInput);


    }

    public void displayTikTaToeBoard() {
        //for(var board: tikTaToeBoard){
        //    System.out.println(Arrays.deepToString(tikTaToeBoard));

        String[] heading = {" ", " ", " "};
        JTable table = new JTable(tikTaToeBoard, heading);
        Font font = new Font("Verdana", Font.PLAIN, 12);
        table.setFont(font);
        table.setRowHeight(30);
        table.setGridColor(blue);
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
        frame.setBackground(green);
    }


    public void validatePosition(int input) {
        if (inputs.size() != 0) {
            for (int i = 0; i < inputs.size(); i++) {
                if (inputs.get(i) == input) throw new DuplicateFormatFlagsException("Position taken");
            }
        }
    }


    public void storePosition(int input) {
        inputs.add(input);
        count++;
    }

    public void resetPlayerChoice() {
        if (Objects.equals(playerMarker, "X")) {
            playerMarker = "O";
        } else playerMarker = "X";
    }

    public boolean isWon() {
        if (Objects.equals(tikTaToeBoard[0][0], playerMarker) && Objects.equals(tikTaToeBoard[0][1], playerMarker) && Objects.equals(tikTaToeBoard[0][2], playerMarker))
            return isWon = true;
        if (Objects.equals(tikTaToeBoard[1][0], playerMarker) && Objects.equals(tikTaToeBoard[1][1], playerMarker) && Objects.equals(tikTaToeBoard[1][2], playerMarker))
            return isWon = true;
        if (Objects.equals(tikTaToeBoard[2][0], playerMarker) && Objects.equals(tikTaToeBoard[2][1], playerMarker) && Objects.equals(tikTaToeBoard[2][2], playerMarker))
            return isWon = true;
        if (Objects.equals(tikTaToeBoard[0][0], playerMarker) && Objects.equals(tikTaToeBoard[1][0], playerMarker) && Objects.equals(tikTaToeBoard[2][0], playerMarker))
            return isWon = true;
        if (Objects.equals(tikTaToeBoard[0][1], playerMarker) && Objects.equals(tikTaToeBoard[1][1], playerMarker) && Objects.equals(tikTaToeBoard[2][1], playerMarker))
            return isWon = true;
        if (Objects.equals(tikTaToeBoard[0][2], playerMarker) && Objects.equals(tikTaToeBoard[1][2], playerMarker) && Objects.equals(tikTaToeBoard[2][2], playerMarker))
            return isWon = true;
        if (Objects.equals(tikTaToeBoard[0][0], playerMarker) && Objects.equals(tikTaToeBoard[1][1], playerMarker) && Objects.equals(tikTaToeBoard[2][2], playerMarker))
            return isWon = true;
        if (Objects.equals(tikTaToeBoard[0][2], playerMarker) && Objects.equals(tikTaToeBoard[1][1], playerMarker) && Objects.equals(tikTaToeBoard[2][0], playerMarker))
            return isWon = true;
        else return isWon = false;
    }

    public void displayMessage() {
        String name = players[currentPlayer].getName();
        if (isWon) {
            display(name + ", Congratulations you won");
            System.exit(0);
        }
    }

    public String getCurrentPlayerName() {
        return players[currentPlayer].getName();
    }

    public void exit() {
        if (inputs.size() == 9) {
            display("All chances have been taken, Game ends now");
            System.exit(0);
        }

    }


    public void play(int input) {
        processingPosition(input);
        displayTikTaToeBoard();
        isWon();
        displayMessage();
        resetPlayerChoice();
        resetCurrentPlayer();
        exit();

    }

    private static String input(String Prompt) {
        return JOptionPane.showInputDialog(Prompt);

    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);


    }
}



    
