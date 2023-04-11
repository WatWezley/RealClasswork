package DSA;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LCMTest {

    @Test
    public void findLCM(){
        assertEquals(Arrays.toString(new int[]{2,37,887}),Arrays.toString(LCM.calculatingLcm(65638)));
    }

}