package tdd;

import java.util.Scanner;

public class HekkaParcelApp {

    public static void main(String[] args) {

        HekkaParcel ugo = new HekkaParcel(0, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of Parcel Scanned:");
        int parcelScanned = scanner.nextInt();
        ugo.setParcelScanned(parcelScanned);

        System.out.print("Enter amount of Parcel Delivered:");
        int parcelDelivered = scanner.nextInt();
        ugo.setParcelDelivered(parcelDelivered);

        while (parcelDelivered < 0 || parcelScanned < 0) {
            System.out.println("OGA ENTER THE RIGHT INFORMATION JARE");
            System.out.println();
            System.out.print("Enter amount of Parcel Scanned:");
            int anotherParcelScanned = scanner.nextInt();
            ugo.setParcelScanned(anotherParcelScanned);

            System.out.print("Enter amount of Parcel Delivered:");
            int anotherParcelDelivered = scanner.nextInt();
            ugo.setParcelDelivered(anotherParcelDelivered);

            System.out.println();
            System.out.printf("The Collection Rate is %.2f%n", ugo.getCollectionRate(anotherParcelScanned, anotherParcelDelivered));
            System.out.printf("The Commission on Delivery is %.2f%n", ugo.getBonus(ugo.getCollectionRate(anotherParcelScanned, anotherParcelDelivered)));
            break;
        }

        System.out.println();
        if (parcelDelivered > 0 && parcelScanned > 0) {
            System.out.printf("The Collection Rate is %.2f%n", ugo.getCollectionRate(parcelScanned, parcelDelivered));
            System.out.printf("The Commission on Delivery is %.2f%n", ugo.getBonus(ugo.getCollectionRate(parcelScanned, parcelDelivered)));


        }
    }
}
