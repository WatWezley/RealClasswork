package tdd;

import java.util.Scanner;

public class PetrolApp {
    public static void main(String[] args) {
        PetrolPurchase famiba = new PetrolPurchase("surulere","pms",100, 200, 0.1 );
        Scanner scanner= new Scanner(System.in);

        System.out.print("enter the quantity to purchase:");
        int quantity = scanner.nextInt();
        famiba.setQuantity(quantity);

        System.out.println();
        System.out.printf("The petrol stations location is %s%n",famiba.getLocation());
        System.out.printf("Petrol type purchased: %s%n",famiba.getPetrolType());
        System.out.printf("Price of %s: %.2f%n", famiba.getPetrolType() ,famiba.getPricePerLitre());
        System.out.printf("The total price: %.2f%n", famiba.getTotalCost());
        System.out.printf("Discount: %.2f%n",famiba.getPercentageDiscount());
        System.out.printf("Net cost is %.2f%n", famiba.getPriceAmount());
    }
}
