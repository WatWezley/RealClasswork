package chapterEleven.chapterEleven2;

import java.math.BigDecimal;

public class main {

    private static final double CUSTOMER_DEFAULT_DEPOSIT_AMOUNT = 100;

    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(BigDecimal.valueOf(CUSTOMER_DEFAULT_DEPOSIT_AMOUNT));

        try {
            account.withdrawal(BigDecimal.valueOf(CUSTOMER_DEFAULT_DEPOSIT_AMOUNT).multiply(BigDecimal.TEN));
        } catch (OleBalanceException e) {
            throw new RuntimeException(e);
        }

    }
}
