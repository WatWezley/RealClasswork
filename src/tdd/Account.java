package tdd;

import javax.swing.*;

public class Account {
    private String name;
    private int balance;
    private String pin = "1234";

    public Account(int intialDeposit) {
        balance=intialDeposit;
    }


    public String getName(){
        return name;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance = balance + amount;

        }

    }


    public int getBalance() {
        return balance;
    }


    public void withdrawal(int amount, String userPin) {
        if (pin.equals(userPin)) {
            int minimumBalance = 10000;
            if (amount > 0 && amount <= balance - minimumBalance) {
                balance = balance - amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }


    }

    public void setPin(String userPin) {
        pin = userPin;
    }

    public void setName( String yourName) {
        name = yourName;
    }
}









