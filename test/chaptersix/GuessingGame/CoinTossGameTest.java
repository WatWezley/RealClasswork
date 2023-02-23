package chaptersix.GuessingGame;

import chaptersix.CoinToss.CoinGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossGameTest {

    private CoinGame coinTossGame;



    @BeforeEach
    public void setUp(){
        coinTossGame=new CoinGame();
    }


    @Test
    public void testThatGameExists(){
        assertNotNull(coinTossGame);
    }

    @Test
    public void testMenuOption(){
        String menu=CoinGame.getGameMenu();
        assertTrue(menu.equals("""
                1. Toss Coin
                2. Exit Game
                """));
    }

    @Test
    public void testCoinFlip(){
       String outcome = coinTossGame.flip();
       assertNotNull(outcome);
       assertTrue(outcome.equals("HEADS")||outcome.equals("TAILS"));
    }

    @Test
    public void testCountOutcome(){
        coinTossGame.flip();
        assertTrue(coinTossGame.getHeadsCount()==1||coinTossGame.getTailsCount()==1);
    }




}
