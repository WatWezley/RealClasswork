package chapterThree;

import tdd.Account;

import java.util.Scanner;



// Inputting and outputting floating-point numbers with Account objects
// import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(121);
        Account account2 = new Account(120);


        // display initial balance of each object
        displayAccount(account1);
        displayAccount(account2);

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); // prompt
        int depositAmount = input.nextInt();
        System.out.printf("%nadding to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        // display balances
        displayAccount(account1);
        displayAccount(account2);


        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextInt();
        System.out.printf("%nadding to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        // display balances

        displayAccount(account1);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $ %d only %n", accountToDisplay.getName(), accountToDisplay.getBalance() );
    }
}
