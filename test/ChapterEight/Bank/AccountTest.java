package ChapterEight.Bank;

import chapterEight.Bank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account famiba;

    @BeforeEach
    public void setUp() {
        famiba = new Account("000001234","Favour","1234");
    }


    @Test
    public void depositMoney() {

        famiba.deposit(BigDecimal.valueOf(2_000));
        assertEquals(BigDecimal.valueOf(2_000), famiba.getBalance("1234"));

    }

    @Test
    public void depositMoneyWithWrongPin() {
        famiba.deposit(BigDecimal.valueOf(2_000));
        assertThrows(IllegalArgumentException.class, () -> famiba.getBalance("2345"));


    }

    @Test
    public void withDrawMoney() {
        famiba.deposit(BigDecimal.valueOf(2000));
        famiba.withdrawal( BigDecimal.valueOf(1000), "1234");
        assertEquals(BigDecimal.valueOf(1_000), famiba.getBalance("1234"));

    }

    @Test
    public void withDrawExcessMoney() {
        famiba.deposit(BigDecimal.valueOf(1000));
        assertThrows(IllegalArgumentException.class,()-> famiba.withdrawal(BigDecimal.valueOf(2000), "1234"));

    }

    @Test
    public void wrongPinDuringWithdrawal(){
        famiba.deposit(BigDecimal.valueOf(3000));
        assertThrows(IllegalArgumentException.class,()->famiba.withdrawal(BigDecimal.valueOf(2000),"3431"));
    }
}

