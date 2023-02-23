package chapterfour;

import java.util.Scanner;

public class DriversGallon {

    public static void main(String[] args) {


        double TotalMilesPerGallon = 0;
        int TotalGallons = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the miles for the trip: ");
        int miles = scanner.nextInt();

        while (miles != 0) {
            System.out.print("Enter the number of gallons per trip:");
            int gallons = scanner.nextInt();
            TotalGallons = gallons + gallons;

            double milesPerGallon = (double) miles/ gallons;
            TotalMilesPerGallon = TotalMilesPerGallon+milesPerGallon;

            System.out.print("Enter the miles for the trip: ");
            miles = scanner.nextInt();
        }
        System.out.println("The total gallon used is "+ TotalGallons );
        System.out.println("The total miles per gallon is "+ TotalMilesPerGallon + "miles");
    }
}