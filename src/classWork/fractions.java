package classWork;

import java.util.Scanner;

public class fractions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        int count = 1;
        int counta = 1;
        int divisible = 1;
        double x = 0;
        int numerator = 0;
        int denominator = 1;
        int numerator2 = numerator;
        int denominator2 = denominator;
        int deno = denominator2;
        int nume = numerator2;


        while (count <= n) {
            x = (x + (1 / (count * 1.0)));
            denominator = denominator * count;
            count += 1;
        }

        while (counta <= n) {
            numerator = numerator + (denominator / counta);
            counta += 1;
        }

        while (divisible <= numerator) {
            numerator2 = numerator / divisible;
            denominator2 = denominator / divisible;
            if ((numerator % divisible == 0) && (denominator % divisible == 0)) {
                deno = denominator2;
                nume = numerator2;}
                divisible += 1;
        }


            System.out.printf("%.2f", x);
            System.out.println();
            System.out.println(numerator + "/" + denominator);
            System.out.println(nume + "/" + deno);


        }
    }


