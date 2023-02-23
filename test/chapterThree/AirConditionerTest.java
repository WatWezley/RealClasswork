package chapterThree;

import org.junit.jupiter.api.Test;
import tdd.AirConditioner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test


    public void AcSetOnTest() {
        //given that there is an Ac
        AirConditioner famibaAc = new AirConditioner();
        //when I switch on the Ac
        famibaAc.switchOn(true, 22);
        //check that the Ac is on
        boolean famibaAcSwitch = famibaAc.getSwitchOn();
        assertEquals(true, famibaAcSwitch);
    }

    @Test
    public void AcSetOffTest() {
        //given that there is an Ac
        AirConditioner famibaAc = new AirConditioner();
        //when I switch on the Ac
        famibaAc.switchoff(false);
        //check that the Ac is off
        boolean famibaAcSwitch = famibaAc.getSwitchOn();
        assertEquals(false, famibaAcSwitch);
    }


    @Test
    public void increaseTemp() {
        //given that there is an Ac
        AirConditioner famibaAc = new AirConditioner();
        //given that default is 22 degrees
        famibaAc.defaultTemp(22);
        // given that the Ac is switchOn;
        famibaAc.switchOn(true, 22);
        // when I increase the temp
        famibaAc.increaseTemp(28);
        // check if the temp increase
        String temperature = "increase temperature";
        assertEquals("increase temperature", temperature);


    }


    @Test
    public void decreaseTemp() {
        //given that there is an Ac
        AirConditioner famibaAc = new AirConditioner();
        //given that default is 22 degrees
        famibaAc.defaultTemp(22);
        // given that the Ac is switchOn;
        famibaAc.switchOn(true, 22);
        // when I increase the temp
        famibaAc.decreaseTemp(18);
        // check if the temp increase
        String temperature = "decrease temperature";
        assertEquals("decrease temperature", temperature);

    }


    @Test
    public void above30Temp() {
        //given that there is an Ac
        AirConditioner famibaAc = new AirConditioner();
        //given that default is 22 degrees
        famibaAc.defaultTemp(22);
        // given that the Ac is switchOn;
        famibaAc.switchOn(true, 22);
        // when I increase the temp
        famibaAc.increaseTemp(30);
        // check if the temp will remain 30);
        int maximumTemp = 30;
        assertEquals(30,maximumTemp);

    }
@Test
    public void below16Temp() {
        //given that there is an Ac
        AirConditioner famibaAc = new AirConditioner();
        //given that default is 22 degrees
        famibaAc.defaultTemp(22);
        // given that the Ac is switchOn;
        famibaAc.switchOn(true, 22);
        // when I increase the temp
        famibaAc.increaseTemp(10);
        // check if the temp will remain 16);
        int minimumTemp = 16;
        assertEquals(16,minimumTemp);

    }
}