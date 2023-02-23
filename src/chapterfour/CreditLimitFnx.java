package chapterfour;

import java.util.Scanner;

public class CreditLimitFnx {

    private final int accountNumber;

    private int balance;

    private int totalItemsCharged = 0;

    private int creditAppliedThisMonth = 0;

    private final int creditLimit = -5000;

    private int itemCharged;

    public CreditLimitFnx(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getBalance(int balance, int itemCharged){
        this.balance = balance - itemCharged;
        return balance;
    }

    public void setTotalItemsCharged(int totalItemsCharged, int itemCharged){
        this.totalItemsCharged = totalItemsCharged + itemCharged;
    }
    public int getTotalItemsCharged(){
        return totalItemsCharged;
    }

    public void setCreditAppliedThisMonth(int balance){
        this.creditAppliedThisMonth = balance;
    }

    public int getCreditAppliedThisMonth(){
        return creditAppliedThisMonth;
    }

    public void shoppingLimit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to shop, choose 1 for YES or 2 for NO: ");
        int shopping = scanner.nextInt();

        while (shopping != 2){
            while(balance > creditLimit){
                System.out.print("What do you want: ");
                String item = scanner.next();
                System.out.print("what is the quantity: ");
                int quantity = scanner.nextInt();
                System.out.print(" the price of "+ item + " is : ");
                int price = scanner.nextInt();
                itemCharged = quantity*price;

                if ((balance - itemCharged) < creditLimit){
                    System.out.println("Credit limit exceed, Purchase denied");}
                    else{
                    getBalance( balance,itemCharged);
                    setCreditAppliedThisMonth(balance);
                    setTotalItemsCharged(totalItemsCharged, itemCharged);
                    System.out.println("balance is "+ balance);
                    System.out.println("TOTAL CHARGE ON ITEMS BOUGHT THIS MONTH is "+ totalItemsCharged);
                    System.out.println("Total credit applied for is " + creditAppliedThisMonth);
                    }
                break;

            }
            System.out.println("Do you want to shop, choose 1 for YES or 2 for NO: ");
            shopping = scanner.nextInt();
        }

        System.out.println("THANKS FOR YOUR PATRONAGE");
    }
}
