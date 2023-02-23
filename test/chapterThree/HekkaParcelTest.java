package chapterThree;

import org.junit.jupiter.api.Test;
import tdd.HekkaParcel;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HekkaParcelTest {

    @Test

    public void dailyParcelScannedTest() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        // when an amount of parcel is scanned
        ugo.setParcelScanned(60);
        //check that the amount of parcel scanned is 60
        ugo.getParcelScanned();
        assertEquals(60, ugo.getParcelScanned());

    }

    @Test
    public void dailyParcelScannedNegativeTest() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        // when an amount of parcel scanned is written in negative numbers
        ugo.setParcelScanned(-50);
        //check that the amount of parcel scanned is 60
        assertEquals(0, ugo.getParcelScanned());
    }

    @Test
    public void dailyParcelDeliveryTest() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        //when an amount of parcel delivered is 34
        ugo.setParcelDelivered(34);
        //check that the amount of parcel delivered is 34
        assertEquals(34, ugo.getParcelDelivered());

    }

    @Test
    public void dailyParcelDeliveryNegativeTest() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        //when an amount of parcel delivered is 34
        ugo.setParcelDelivered(-34);
        //check that the amount of parcel delivered is 34
        assertEquals(0, ugo.getParcelDelivered());

    }

    @Test
    public void dailyCollectionRateTest() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        //when an amount of parcel scanned is 60 and amount of parcel delivered is 45
        double cR = ugo.getCollectionRate(60,45);
        //check that the collection rate is
        assertEquals(75.0, cR);
    }

    @Test
    public void dailyCollectionRateNegativeTest() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        //when an amount of parcel scanned is 60 and amount of parcel delivered is 45
        double cR = ugo.getCollectionRate(60,-45);
        //check that the collection rate is
        assertEquals(0.0, cR);
    }

    @Test
    public void bonusBelow50Test() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        //when an amount of parcel scanned is 60 and amount of parcel delivered is 45
        ugo.setParcelDelivered(45);
        double commissionOnDelivery = ugo.getBonus(10);
        //check that for 75 percent, the bonus given is 22500
        assertEquals(0.0, commissionOnDelivery);

    }

    @Test
    public void bonusAbove50Below59Test() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        //when an amount of parcel scanned is 60 and amount of parcel delivered is 45
        ugo.setParcelDelivered(45);
        double commissionOnDelivery = ugo.getBonus(54);
        //check that for 75 percent, the bonus given is 22500
        assertEquals(9000, commissionOnDelivery);
    }

    @Test
    public void bonusAbove60Below69Test() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        //when an amount of parcel scanned is 60 and amount of parcel delivered is 45
        ugo.setParcelDelivered(45);
        double commissionOnDelivery = ugo.getBonus(66);
        //check that for 75 percent, the bonus given is 22500
        assertEquals(11250, commissionOnDelivery);
    }

    @Test
    public void bonusAbove70Test() {
        //given that there is a delivery company
        HekkaParcel ugo = new HekkaParcel(0, 0);
        //when an amount of parcel scanned is 60 and amount of parcel delivered is 45
        ugo.setParcelDelivered(45);
        double commissionOnDelivery = ugo.getBonus(80);
        //check that for 75 percent, the bonus given is 22500
        assertEquals(22500, commissionOnDelivery);
    }
}