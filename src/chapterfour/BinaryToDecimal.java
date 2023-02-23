package chapterfour;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary: ");
        String binary = scanner.nextLine();
        //System.out.println("the length of the binary is " + binary.length());

        int multiplier = 1;
        int decimal = 0;
        int counter;
        for (counter = binary.length()-1; counter >=0; counter--) {
            String decimal2 = String.valueOf(binary.charAt(counter));
            int decimal3 = Integer.parseInt(decimal2) * multiplier;
            multiplier = multiplier * 2;
            decimal = decimal + decimal3;
            //System.out.println("the multiplier is " + multiplier);
            //System.out.println(" the decimal is " + decimal);
        }
        System.out.println(decimal);
    }
}

