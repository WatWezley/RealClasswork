package chapterThree;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class AccountTest {

    @Test
    public void depositTest() {

        // given
        Account favourAccount = new Account(2000);
        // given that the account has a name

        favourAccount.setName( "Ugochi");

        // when i deposit 5000
        favourAccount.deposit(5000);

        // check that the balance  is 7000 and the name is ugochi

        int favourAccountBalance = favourAccount.getBalance();
        String favourName = favourAccount.getName();
        assertEquals(7000, favourAccountBalance);
        assertEquals("Ugochi", favourAccount.getName() );
    }

    @Test
    public void depositTwiceTest() {
        //given there is an account
        Account favourAccount = new Account(2000);

        // given that intial balance is 4000
        favourAccount.deposit(4000);

        //when i deposit 2000
        favourAccount.deposit(4000);

        // check that balance is 10000
        int favourAccountBalance = favourAccount.getBalance();
        assertEquals(10000, favourAccountBalance);


    }

    @Test
    public void depositNegativeAmountTest() {
        // given there is an account
        Account favourAccount = new Account(2000);

        // given that intial balance is 4000
        favourAccount.deposit(4000);

        //when i deposit -2000
        favourAccount.deposit(-2000);

        // check that balance is 4000
        int favourAccountBalance = favourAccount.getBalance();
        assertEquals(6000, favourAccountBalance);
    }


@Test

    public void withdrawalTest () {
    // given there is an account
    Account favourAccount =  new Account(2000);
    // given that the intial balance 100000
    favourAccount.deposit( 100000);
    // As i withdraw 20000
    favourAccount.withdrawal(20000, "1234");
    // check that balance is 80000
    int favourAccountBalance = favourAccount.getBalance();
    assertEquals(82000, favourAccountBalance);



    }

    @Test

    public void withdrawalexcessTest () {
        // given that there is an account
        Account favourAccount = new Account(2000);
        // given the initial balance is 0
        favourAccount.deposit(0);
        // given there is a deposit of 50000
        favourAccount.deposit(50000);
        // i withdraw 60000
        favourAccount.withdrawal(60000, "1234");
        // check if it will return intial balance
        int favourAccountBalance = favourAccount.getBalance();
        assertEquals(52000, favourAccountBalance);

    }


    @Test
       public void minBalanceTest () {
           //given that there is an account
            Account favourAccount  = new Account(2000);
            // given an intial balance of 50000
            favourAccount.deposit( 50000);
            // when i withdraw 50000 with a minimum balance of 10000
            favourAccount.withdrawal(30000, "1234");
            int favourAccountBalance = favourAccount.getBalance();
            // check that my balance is 50000
        assertEquals(22000, favourAccountBalance);


        }

        @Test

        public void createPin(){

        //given that there is an account
            Account ugoAccount = new Account(2000);
            // given that there is a deposit of 20000
            ugoAccount.deposit(20000);
            //given that there is an pin to the account
            ugoAccount.setPin( "2345");
            // when i withdraw 5000 with wrong pin
            ugoAccount.withdrawal(5000,"1234");
            // check that the balance is 20000
            assertEquals(22000, ugoAccount.getBalance());


        }

@Test

        public void createIntialBalanceTest(){
        Account ugoAccount = new Account(2000);
        //check if intial deposit is 2000
            assertEquals(2000, ugoAccount.getBalance());

        }
        }

