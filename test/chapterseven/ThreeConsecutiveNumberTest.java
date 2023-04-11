package chapterseven;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeConsecutiveNumberTest {

    ThreeNumbers threeConsecutiveNumber = new ThreeNumbers();

    @Test
    public void checkForThreeConsecutiveNumber(){
       assertEquals(3,threeConsecutiveNumber.sumOfConsecutiveNumber(4,10,2));
    }

}