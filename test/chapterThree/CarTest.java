package chapterThree;

import org.junit.jupiter.api.Test;
import tdd.CarShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test

    public void carTypeTest (){
        //given that there are shop for car-purchase
        CarShop jethro = new CarShop("Toyota", "2010", 2000000);
        assertEquals("Toyota", jethro.getModel() );
        assertEquals("2010", jethro.getYear());
        assertEquals(2000000, jethro.getPrice());
    }

    @Test
    public void carPriceTest(){
       // given that there is a car-shop
        CarShop jethro = new CarShop("Toyota", "2010",0);
        //when a negative price is entered
        jethro.setPrice(-1500000);
        //check that when negative numbers it returns 0
        assertEquals(0,jethro.getPrice());
    }

    @Test
    public void discountedPrice(){
        //given that there are two cars for sale
        CarShop jethro = new CarShop ("Toyota", "2010" ,3000000);
        CarShop miracle = new CarShop ("Benz", "2010" ,3000000);
        //when there is a discount on the different cars, discounted price will be
        double toyotaPrice = jethro.getDiscountedPrice(0.05);
        double benzPrice = miracle.getDiscountedPrice(0.07);
        //check the discounted price
        assertEquals(2850000, toyotaPrice);
        assertEquals(2790000, benzPrice);


    }

}
