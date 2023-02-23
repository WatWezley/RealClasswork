package chapterThree;

import org.junit.jupiter.api.Test;
import tdd.Bike;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test

    public void switchOnBikeTest() {
        //given that there is a bike
        Bike favourBike = new Bike();
        //when the bike is switch on
        favourBike.setOn(true);
        //check that the bike is on
        assertEquals(true, favourBike.getSetOn());


    }

    @Test

    public void switchOffBikeTest() {
        //given that there is a bike
        Bike favourBike = new Bike();
        //when the bike is switch on
        favourBike.setoff(false);
        //check that the bike is on
        assertEquals(false, favourBike.getSetOff());

    }

    @Test
    public void accelerateWithGearOneTest() {
        //given that there ia a bike
        Bike favourBike = new Bike();
        //given that the bike is on
        favourBike.setOn(true);
        //given that the bike is in gear one
        favourBike.accelerate(16);
        //check that the speed is one step higher
        assertEquals(17, favourBike.getaccelerate());
    }

    @Test
    public void accelerateWithGearTwoTest() {
        //given that there ia a bike
        Bike favourBike = new Bike();
        //given that the bike is on
        favourBike.setOn(true);
        //given that the bike is in gear one
        favourBike.accelerate(25);
        //check that the speed is one step higher
        assertEquals(27, favourBike.getaccelerate());
    }

    @Test
    public void accelerateWithGearThreeTest() {
        //given that there ia a bike
        Bike favourBike = new Bike();
        //given that the bike is on
        favourBike.setOn(true);
        //given that the bike is in gear one
        favourBike.accelerate(37);
        //check that the speed is one step higher
        assertEquals(40, favourBike.getaccelerate());
    }

    @Test
    public void accelerateWithGearfourTest() {
        //given that there ia a bike
        Bike favourBike = new Bike();
        //given that the bike is on
        favourBike.setOn(true);
        //given that the bike is in gear one
        favourBike.accelerate(56);
        //check that the speed is one step higher
        assertEquals(60, favourBike.getaccelerate());
    }

    @Test
    public void decelerateWithGearOneTest() {
        //given that there ia a bike
        Bike favourBike = new Bike();
        //given that the bike is on
        favourBike.setOn(true);
        //given that the bike is in gear one
        favourBike.decelerate(16);
        //check that the speed is one step higher
        assertEquals(15, favourBike.getdecelerate());
    }

    @Test
    public void decelerateWithGearTwoTest() {
        //given that there ia a bike
        Bike favourBike = new Bike();
        //given that the bike is on
        favourBike.setOn(true);
        //given that the bike is in gear one
        favourBike.decelerate(26);
        //check that the speed is one step higher
        assertEquals(24, favourBike.getdecelerate());
    }

    @Test
    public void decelerateWithGearThreeTest() {
        //given that there ia a bike
        Bike favourBike = new Bike();
        //given that the bike is on
        favourBike.setOn(true);
        //given that the bike is in gear one
        favourBike.decelerate(36);
        //check that the speed is one step higher
        assertEquals(33, favourBike.getdecelerate());
    }

    @Test
    public void decelerateWithGearFourTest() {
        //given that there ia a bike
        Bike favourBike = new Bike();
        //given that the bike is on
        favourBike.setOn(true);
        //given that the bike is in gear one
        favourBike.decelerate(66);
        //check that the speed is one step higher
        assertEquals(62, favourBike.getdecelerate());
    }
}