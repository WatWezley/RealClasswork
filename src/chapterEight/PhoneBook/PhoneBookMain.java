package chapterEight.PhoneBook;

import javax.swing.*;
import java.util.DuplicateFormatFlagsException;
import java.util.InputMismatchException;

public class PhoneBookMain {

    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu() {
        String mainMenu = """
                ===================================
                Welcome to A Programmers PhoneBook
                ====================================
                1 -> Create Contact
                2 -> View Contact
                3 -> Count Contact
                4 -> Update Existing Contact
                5 -> Delete Contact
                6 -> Exit
                ===================================
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createContacts();
            case '2' -> viewContacts();
            case '3' -> checkNumberOfContact();
            case '4' -> updateExistingContact();
            case '5' -> deleteExistingContact();
            case '6' -> exitApplication();
            default -> goToMainMenu();


        }
    }

    private static void exitApplication() {
        System.exit(1);
    }

    private static void deleteExistingContact() {
        String name = input("Enter name: ");
        try {
            phoneBook.deleteContact(name);
        } catch (InputMismatchException ex) {
            display(ex.getMessage());
            deleteExistingContact();
        }
        goToMainMenu();
    }

    private static void updateExistingContact() {
        String name = input("Enter name: ");
        String editName = input("Enter New Name: ");
        String editPhoneNumber = input("Enter New PhoneNumber: ");
        String editMobileNumber = input("Enter New Mobile Number: ");
        String editedEmail = input("Enter New Email: ");
        try {

            phoneBook.editContact(name, editName, editPhoneNumber, editMobileNumber, editedEmail);
        } catch (IllegalArgumentException ex) {
            display("Wrong Contact Name");
            updateExistingContact();
        }
        goToMainMenu();
    }

    private static void checkNumberOfContact() {
        int number = phoneBook.getTotalNumberOfContacts();
        display(String.valueOf(number));
        goToMainMenu();
    }

    private static void viewContacts() {
        String name = input("Enter Name");
        try {
            display(phoneBook.viewContactWith(name).toString());
        } catch (IllegalArgumentException ex) {
            display(ex.getMessage());
        }
        goToMainMenu();
    }

    private static void createContacts() {
        String firstName = input("Enter FirstName: ");
        String lastName = input("Enter lastName: ");
        String phoneNumber = input("Enter PhoneNumber: ");
        String mobileNumber = input("Enter mobileNumber: ");
        String emailAddress = input("Enter emailAddress: ");
        try {
            phoneBook.createContact(firstName, lastName, phoneNumber, mobileNumber, emailAddress);
        } catch (DuplicateFormatFlagsException ex) {
            display("THIS NAME ALREADY EXIST");
            createContacts();
        }
        goToMainMenu();
    }


    private static String input(String Prompt) {
        String input = JOptionPane.showInputDialog(Prompt);
        if (input.equals("")){
            display("Invalid input");
            goToMainMenu();
        }
        return input;

    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
}
