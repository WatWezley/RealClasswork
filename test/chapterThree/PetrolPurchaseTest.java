package chapterThree;

import org.junit.jupiter.api.Test;
import tdd.PetrolPurchase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {


    @Test
    public void stationLocationTest() {
        //given there is a filling station
        PetrolPurchase famibaStation = new PetrolPurchase("surulere", "pms", 10, 200, 0.1);
        // when the filling is in a location
        famibaStation.setLocation("surulere");
        // check the surulere is the location
        String location = famibaStation.getLocation();
        assertEquals("surulere", famibaStation.getLocation());
    }

    @Test

    public void pricePerLitreTest() {
        //given there is a filling station
        PetrolPurchase famibaStation = new PetrolPurchase("surulere", "pms", 10, 200, 0.1);
        // when the filling is in a location
        famibaStation.setPricePerLitre(200);
        //check that the pricePerLitre is 200
        String petrolType = famibaStation.getPetrolType();
        assertEquals(200, famibaStation.getPricePerLitre());

    }

    @Test
    public void petrolTypeTest() {
        //given there is a filling station
        PetrolPurchase famibaStation = new PetrolPurchase("surulere", "pms", 10, 200, 0.1);
        // when the filling is in a location
        famibaStation.setPetrolType("pms");
        //check that the petrolType is pms
        String petrolType = famibaStation.getPetrolType();
        assertEquals("pms", famibaStation.getPetrolType());
    }

    @Test
    public void quantity() {
        //given there is a filling station
        PetrolPurchase famibaStation = new PetrolPurchase("surulere", "pms", 10, 200, 0.1);
        // when the price of pms is
        famibaStation.setQuantity(200);
        //check that the quantity is 200
        assertEquals(200, famibaStation.getQuantity());
    }


    @Test
    public void percentageDiscount() {
        //given there is a filling station
        PetrolPurchase famibaStation = new PetrolPurchase("surulere", "pms", 10, 200, 0.1);
        // when there is a discount of 10 percent
        famibaStation.setPercentageDiscount(0.1);
        famibaStation.setPricePerLitre(200);
        famibaStation.setQuantity(200);
        //check that the discount is 200
        assertEquals(4000, famibaStation.getPercentageDiscount());
    }

    @Test
    public void purchaseAmount(){
        //given there is a filling station
        PetrolPurchase famibaStation = new PetrolPurchase("surulere", "pms", 10, 200, 0.1);
        // when a customers buy pms, 20litres on a discount of 10
        famibaStation.setPetrolType("pms");
        famibaStation.setPricePerLitre(200);
        famibaStation.setQuantity(20);
        famibaStation.setPercentageDiscount(0.1);
        //check that the priceAmount
        assertEquals(3600, famibaStation.getPriceAmount());
    }


}



