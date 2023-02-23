package chapterEight.Bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    ArrayList<String> accountNumbers = new ArrayList<>();


    ArrayList<Account> accounts = new ArrayList<>();

    private String newAccountNumber;


    private String firstName;

    private String lastName;

    public ArrayList<Account> getAccounts() {
        return accounts;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String generatePin() {
        if (accountNumbers.size() == 0) {
            accountNumbers.add("00001121234");
        }
        String newAccountNumber = "";
        int modifiedNumber;
        String previous = accountNumbers.get(accountNumbers.size() - 1);
        for (int i = 0; i < previous.length(); i++) {
            String singleNumber = String.valueOf(previous.charAt(i));
            modifiedNumber = (Integer.parseInt(singleNumber));
            if (i > 4) {
                modifiedNumber = (Integer.parseInt(singleNumber)) * 2;
                int mod = modifiedNumber % 10;
                modifiedNumber = mod;
            }
            newAccountNumber = newAccountNumber + modifiedNumber + "";
        }
        accountNumbers.add(newAccountNumber);
        return newAccountNumber;
    }

    public Account createNewAccount(String lastName, String firstName, String pin) {
        String newAccountNumber = generatePin();
        Account newAccount = new Account(newAccountNumber, lastName + " " + firstName, pin);
        accounts.add(newAccount);
        System.out.println((newAccountNumber));
        return newAccount;
    }

    public int getNumberOfCustomer() {
        return accounts.size();
    }

    public Account findAccount(String accountNumber) {
        Account account1 = null;
        for (var account : accounts) {
            if (Objects.equals(account.getAccountNumber(), accountNumber)) {
                account1 = account;
            }

        }return account1;
    }

    public BigDecimal checkBalanceFor(String accountNumber, String accountPin) {
        Account account = findAccount(accountNumber);
        return account.getBalance(accountPin);
    }

    public void depositInto(BigDecimal amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdrawFrom(String accountNumber, BigDecimal amount, String pin) {
        Account account = findAccount(accountNumber);
        account.withdrawal(amount, pin);
    }


    public void transfer(BigDecimal amount, String senderAccountNumber, String receiverAccountNumber, String senderPin) {
        Account receiverAccount = findAccount(receiverAccountNumber);
        Account senderAccount = findAccount(senderAccountNumber);

        senderAccount.withdrawal(amount, senderPin);
        receiverAccount.deposit(amount);
    }
}






