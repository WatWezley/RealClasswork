package chapterEight.Bank;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class ATM {
    Scanner scanner = new Scanner(System.in);
    static Bank regnos = new Bank();

    public static void main(String[] args) {
        gotoMainMenu();
    }

    private static void gotoMainMenu() {
        String mainMenu = """
                ===================================
                Welcome to Wema Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Exit
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> checkBalance();
            case '6' -> exitApplication();
            default -> gotoMainMenu();
        }}


    private static void exitApplication() {
        display("Thank you for using our application ");
        System.exit(1);
    }

    private static void checkBalance() {
        String accountNumber = input("Enter Your Account Number");
        String pin = input("Enter Your Pin");
        String accountBalance =String.format( """
    Your account balance is %s
				""", regnos.checkBalanceFor(accountNumber, pin).toPlainString());
        display(accountBalance);
        gotoMainMenu();
    }

    private static void transfer() {
        String senderAccountNumber = input("Enter Your Account Number");
        String receiverAccountNumber = input("Enter Your Receiver Account Number");
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter Your Amount")));
        String senderPin = input("Enter your Pin");
        try {
            regnos.transfer(amount, senderAccountNumber, receiverAccountNumber, senderPin);
        }
        catch (IllegalArgumentException error){
            display(error.getMessage());
            transfer();
        }

        gotoMainMenu();
    }

    private static void withdraw() {
        String accountNumber = (input("Enter your account number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        String pin = input("Enter your Pin");
        try {
            regnos.withdrawFrom(accountNumber, amount, pin);
        }
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            withdraw();
        }

        gotoMainMenu();

    }

    private static void deposit() {
        String accountNumber = (input("Enter Your Account Number"));
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter Your Amount")));
        regnos.depositInto(amount, accountNumber);
        display("Deposit Successfully");
        gotoMainMenu();
    }

    private static void createAccount() {
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");



        String pin = input("Enter your pin");
        Account account=regnos.createNewAccount(firstName, lastName, pin);
        display("Account created successfully");
        display(account.toString());
        gotoMainMenu(); }

    private static String input(String Prompt){
        return JOptionPane.showInputDialog(Prompt);
        // display(Prompt);
        //  return keyboardInputCollector.nextLine();
    }
    private static void display(String prompt){
        //System.out.println(prompt);
        JOptionPane.showMessageDialog(null, prompt);
    }

}











