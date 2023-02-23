package chapterfour;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  x Number: ");
        int x = scanner.nextInt();
        System.out.print("Enter  y Number: ");
        double y = scanner.nextDouble();

        double z = 1;
        double power = 1;

        if (y < 0) {
            double count = y;
            while (count < 0) {
                z = (z * x);
                power = (1/z);
                count += 1;
            }
            System.out.printf("%.2f", power);
        }

         else if (y > 0) {
                int counta = 0;
                while (counta <= y) {
                    z = z * x;
                    counta += 1;}
                System.out.printf("%.2f",z);
                }

            }

        }




