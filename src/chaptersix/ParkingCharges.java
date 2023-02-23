package chaptersix;

import java.util.Scanner;

public class ParkingCharges {

    private static double totalReceipts = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int hours = 0;

        String AnyCustomer;
        do {
            String name = "Customer" + counter;
            System.out.println(name);
            System.out.println(" Enter customer name: ");
            name = scanner.next();
            System.out.println("Enter the number of hours: ");
            hours = scanner.nextInt();
           calculateCharges(hours);


            
            System.out.println("Any other customer, Choose Yes/No: ");
            AnyCustomer = scanner.next();
            counter++;


        } while (!(AnyCustomer.equalsIgnoreCase("No")));

        
    }
    
    public static void calculateCharges(int hours){
        double finalCharges;
        double minimumCharge = 2.00;
        if (hours < 3) {finalCharges = minimumCharge;
            System.out.println(finalCharges);}
         else
        {int hour2 = hours-3;
            double charges2 = hour2*0.5;
            finalCharges = minimumCharge + charges2;
            if (finalCharges>10.00){
                finalCharges = 10.00;
            }
            System.out.println(finalCharges);
        }
        totalReceipts+=finalCharges;
        System.out.println(totalReceipts);
    }
    
    
}

