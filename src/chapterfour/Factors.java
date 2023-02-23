package chapterfour;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner factor = new Scanner(System.in);
        System.out.println( " Enter a number:   ");
        int number = factor.nextInt();
        int factorCounter = 1;
        int mutiply = 0;

        while (factorCounter<=number){
            int remainder = number % factorCounter;
            if( remainder==0) {
                mutiply = mutiply + 1;
            }
            factorCounter= factorCounter+1;
            }
        System.out.printf( "The factors of %d is %d%n", number,mutiply);
        if (mutiply==2){
            System.out.printf("%d is a Prime Number", number);}
            else{
            System.out.printf("%d is Not a Prime Number", number);}
        }
        }


