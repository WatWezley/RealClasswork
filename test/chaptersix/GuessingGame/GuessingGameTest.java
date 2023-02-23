package chaptersix.GuessingGame;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static chaptersix.GuessingGame.GuessingGame.*;
import static org.junit.jupiter.api.Assertions.*;

public class GuessingGameTest {
    private GuessingGame game;

    @BeforeEach
    public void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testThatGameExist() {
        game = new GuessingGame();
        assertNotNull(game);
    }

    @Test
    public void testIfGuessIsLower() {
        GuessingGame.clue(89, 23);
        assertEquals("Too low, try again.", GuessingGame.clue(guessedNumber, userInput));
    }

    @Test
    public void testIfGuessIsHigher() {
        GuessingGame.clue(23, 89);
        assertEquals("Too high, try again.", GuessingGame.clue(guessedNumber, userInput));
    }

    @Test
    public void testWhenCounterIsHigherThanTen() {
        String answer = GuessingGame.expression(12, 65, 23);
        assertEquals("You should be able to do better.", answer);

    }

    @Test
    public void testWhenCounterIsLowerThanTenAndUserInputIsCorrect() {
        String answer = GuessingGame.expression(8, 23, 23);
        assertEquals("Either you know the truth or you got lucky.\"CONGRATULATION.", answer);

    }

    @Test
    public void testWhenCounterIsTwleveAndUserInputIsNotCorrect() {
        int answer = GuessingGame.showGuessNumber(12, 23, 23);
        assertEquals(23, answer);

    }
}