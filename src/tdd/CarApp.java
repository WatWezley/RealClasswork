package tdd;

public class CarApp {

    public static void main(String[] args) {
        CarShop jethro = new CarShop("Toyota", "2010", 400000);
        CarShop miracle = new CarShop("Benz", "2010", 600000);

        jethro.setDiscount("Toyota");
        miracle.setDiscount("Benz");

        System.out.println(jethro.getDiscountedPrice(jethro.getDiscount()));
        System.out.println(miracle.getDiscountedPrice(miracle.getDiscount()));
    }
}
