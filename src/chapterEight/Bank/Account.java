package chapterEight.Bank;


import java.math.BigDecimal;

public class Account {

    private  String accountName;
    private  String pin;
    private String accountNumber;
    private BigDecimal balance = BigDecimal.ZERO;

    public Account(String accountNumber, String accountName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public BigDecimal getBalance(String accountPin) {
        validatePin(accountPin);
        return balance;
    }

    public void validatePin(String accountPin){
        if(!pin.equals(accountPin)) throw new IllegalArgumentException("Invalid Pin");
    }

    public void withdrawal(BigDecimal amount, String pin) {
        validatePin(pin);
       var result = balance.compareTo(amount);
       if(0 > result) throw new IllegalArgumentException("Insufficient Funds");
       balance = balance.subtract(amount);
    }

    public String toString(){
        return String.format("""
              Account name: %s
              Account Number: %s
              Account Balance: %s
              """, accountName, accountNumber, balance.toPlainString());
    }


}
