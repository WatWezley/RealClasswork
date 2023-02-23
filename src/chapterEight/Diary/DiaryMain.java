package chapterEight.Diary;

import javax.swing.*;
import java.util.Scanner;

public class DiaryMain {
    private static Scanner keyboardInputCollector = new Scanner(System.in);

    private static final Diary pDiary = new Diary("wez","9292");


    public static void main(String[] args) {
        lockDiary();
        unlockDiary();
        gotoMainMenu();
    }

    private static void gotoMainMenu() {

        String mainMenu = """
                ===================================
                Welcome to A Programmers Diary
                1 -> Create Entry
                2 -> View Entry
                3 -> Count Entries
                4 -> Update Existing Entry
                5 -> Delete Entry
                6 -> Exit
                ===================================
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createEntry();
            case '2' -> viewEntry();
            case '3' -> checkNumberOfEntry();
            case '4' -> updateExistingEntry();
            case '5' -> deleteExistingEntry();
            case '6' -> exitApplication();
            default -> gotoMainMenu();


        }
    }

    private static void checkNumberOfEntry() {
        pDiary.countNumberOfEntries();
        gotoMainMenu();
    }

    private static void viewEntry() {
        unlockDiary();
        int id = 0;
        try {
            id = Integer.parseInt(input("Enter id"));}
        catch (NumberFormatException ex){
            display("Wrong Number Format ");
            viewEntry();
        }
        try{
            pDiary.findEntry(id);}
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            viewEntry();}
        pDiary.findEntry(id);
        gotoMainMenu();
    }

    private static void deleteExistingEntry() {
        unlockDiary();
        int id = 0;
        try {
            id = Integer.parseInt(input("Enter id"));}
        catch (NumberFormatException ex){
            display("Wrong Number Format ");
            deleteExistingEntry();
        }
        try{
            pDiary.findEntry(id);}
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            deleteExistingEntry();
        }
            pDiary.deleteEntry(id);
            gotoMainMenu();
        }


    private static void exitApplication() {
        lockDiary();
        display("Thank you for using our application ");
        System.exit(1);
    }

    private static void updateExistingEntry() {
        unlockDiary();
        int id = 0;
        try {
           id = Integer.parseInt(input("Enter id"));}
        catch (NumberFormatException ex){
            display("Wrong Number Format ");
            updateExistingEntry();
        }
        try{
            pDiary.findEntry(id);}
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            updateExistingEntry();
        }
        String editBody = input("Enter Body");
        pDiary.editEntry(id,editBody);
        gotoMainMenu();
    }

    private static void createEntry() {
        unlockDiary();
        String title= input("Enter title");
        String body = input("Enter body");
        pDiary.createEntry(title,body);
        gotoMainMenu();
       }

    private static void unlockDiary(){
        String passWord = input("Enter PassWord");
        try {
            validatePassWord(passWord);
        }
        catch (IllegalArgumentException ex){
            display("Wrong Credentials");
            unlockDiary();
        }}

    private static void validatePassWord(String passWords){
        if(!pDiary.getPassWord().equalsIgnoreCase(passWords)) throw new IllegalArgumentException("Invalid PassWord");
        else display("Diary has been unlocked");
    }
    private static String input(String Prompt){
        return JOptionPane.showInputDialog(Prompt);
        //display(Prompt);
        //return keyboardInputCollector.nextLine();
    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
        //System.out.println(prompt);
    }

    private static void lockDiary(){
        display("Diary is Locked");
    }
}

