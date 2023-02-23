package chapterThree;

import chapterThree.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {

    @Test

    public void clockTest() {
        // given  that there is a clock
        Clock famiba = new Clock(0, 0, 0);
        assertNotNull(famiba);

    }

    @Test

    public void hoursTest() {
        //given that there is a clock
        Clock famiba = new Clock(0, 0, 0);
        //when hour is set to 20
        famiba.setHours(20);
        //check that hour is 20
        assertEquals(20, famiba.getHours());

    }

    @Test
    public void excessHoursTest() {
        //given that there is a clock
        Clock famiba = new Clock(0, 0, 0);
        //when hour is set to 20
        famiba.setHours(27);
        //check that hour is 20
        assertEquals(0, famiba.getHours());
    }

    @Test
    public void minutesTest() {
        //given that there is a clock
        Clock famiba = new Clock(0, 0, 0);
        //when hour is set to 20
        famiba.setMinutes(20);
        //check that hour is 20
        assertEquals(20, famiba.getMinutes());

    }

    @Test
    public void excessMinutesTest() {
        //given that there is a clock
        Clock famiba = new Clock(0, 0, 0);
        //when hour is set to 20
        famiba.setMinutes(70);
        //check that hour is 20
        assertEquals(0, famiba.getMinutes());
    }

    @Test
    public void secTest() {
        //given that there is a clock
        Clock famiba = new Clock(0, 0, 0);
        //when hour is set to 20
        famiba.setSec(20);
        //check that hour is 20
        assertEquals(20, famiba.getSec());

    }

    @Test
    public void excessSecTest() {
        //given that there is a clock
        Clock famiba = new Clock(0, 0, 0);
        //when hour is set to 20
        famiba.setSec(70);
        //check that hour is 20
        assertEquals(0, famiba.getSec());
    }


    @Test
    public  void displayTime() {
        //given that there is a clock
        Clock famiba = new Clock(14, 45, 23);
        //when hour is set to 20
        famiba.setDisplayTime(14, 45, 23);
        //check the time
        assertEquals("14:45:23", famiba.getDisplayTime());

    }

}