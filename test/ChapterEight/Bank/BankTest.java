package ChapterEight.Bank;

import chapterEight.Bank.Account;
import chapterEight.Bank.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    Bank regno;
    Account account1;


    @BeforeEach
    public void bankExist() {
        regno = new Bank();
        account1 = regno.createNewAccount("ugo", "chime", "2000");
    }

    @Test
    public void accountCreationTest() {
        assertEquals(1, regno.getNumberOfCustomer());
    }

    @Test
    public void pinGenerationTest() {
        String result = regno.generatePin();
        assertEquals("00001484826", result);
    }


    @Test
    public void numberOfAccountTest() {
        assertEquals(1, regno.getNumberOfCustomer());
    }

    @Test
    public void accountCanBeFoundTest() {
        Account account2 = regno.createNewAccount("mimi", "karl", "1234");
        System.out.println(account2.toString());
        String expected = """
                Account name: mimi karl
                Account Number: 00001484826
                Account Balance: 0
                """;
        System.out.println(regno.findAccount("00001484826"));
        assertEquals(expected, regno.findAccount("00001484826").toString());
    }

    @Test
    public void balanceCanBeCheckedTest() {
        regno.createNewAccount("chichi","Emmanuel","4444");
        assertEquals(BigDecimal.ZERO, regno.checkBalanceFor("00001484826", "4444"));
    }

    @Test
    public void testThatMoneyCanBeDepositedInto() {
        regno.depositInto(BigDecimal.valueOf(20000), "00001242468");
        assertEquals(BigDecimal.valueOf(20000), regno.checkBalanceFor("00001242468", "2000"));
    }

    @Test
    public void testThatCanBeWithdrawn() {
        regno.depositInto(BigDecimal.valueOf(2000), "00001242468");
        System.out.println(regno.checkBalanceFor("00001242468", "2000"));
        regno.withdrawFrom("00001242468", BigDecimal.valueOf(1000), "2000");
        System.out.println(regno.checkBalanceFor("00001242468", "2000"));
        assertEquals(BigDecimal.valueOf(1000), regno.checkBalanceFor("00001242468", "2000"));
    }

    @Test
    public void testThatErrorOccurWithWrongPin() {
        regno.depositInto(BigDecimal.valueOf(2000), "00001242468");
        assertThrows(IllegalArgumentException.class, () -> regno.withdrawFrom("00001242468", BigDecimal.valueOf(1000), "2010"));

    }

    @Test
    public void testThatErrorWithInsufficientFund() {
        regno.depositInto(BigDecimal.valueOf(2000), "00001242468");
        assertThrows(IllegalArgumentException.class, () -> regno.withdrawFrom("00001242468", BigDecimal.valueOf(3000), "2000"));
    }

    @Test
    public void testThatAccountCanTransfer() {
        Account account5 = regno.createNewAccount("favour", "chime", "2222");
        regno.depositInto(BigDecimal.valueOf(2000), "00001484826");
        Account account6 = regno.createNewAccount("jethro", "chime", "2010");
        regno.depositInto(BigDecimal.valueOf(10), "00001868642");
        regno.transfer(BigDecimal.valueOf(500), "00001484826", "00001868642", "2222");
        regno.findAccount("00001868642");
    }
}
