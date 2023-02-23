package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSampleTest {

    @Test
    public void PositiveExeceptionTest() {
        //given that there are a set of numbers;
        classWork.NumberSample famiba = new classWork.NumberSample(2, 3, 6, 8, 54);
        //when there are a list of number
        // check that 15 is the outliner
        int outLiner = famiba.listEvenNumber(2,3,6,8,54 );
        assertEquals(3, outLiner);
    }

    @Test
    public void NegativeExeceptionTest() {
        //given that there are a set of numbers;
        classWork.NumberSample famiba = new classWork.NumberSample(3, 7, 6, 21, 27);
        //when there are a list of number
        // check that 15 is the outliner
        int outLiner = famiba.listOddNumber(3,7,6,21,27 );
        assertEquals(6, outLiner);
    }
}
