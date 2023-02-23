package chapterfour;

import java.util.Scanner;

public class loopOddEven {
    public static void main(String[] args) {
        Scanner oddEven = new Scanner(System.in);
        System.out.print("Enter a POSITIVE number or NEGATIVE to stop:  ");
        int number = oddEven.nextInt();
        int even = 0;
        int odd = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int famCounter=1;

        while(number>0){
            int remainder=number%2;
            if (remainder==0){
                even=even+1;
                sumEven=sumEven+number;}
                else{
                    odd=odd+1;
                    sumOdd=sumOdd+number;}

            System.out.print("Enter a POSITIVE number or NEGATIVE to stop:  ");
             number = oddEven.nextInt();


        }
        System.out.printf("The number of even is %d%n", even);
        System.out.printf("The sum of the even numbers is %d%n", sumEven);

        System.out.println();
        System.out.printf("The number of odd is %d%n", odd);
        System.out.printf("The sum of the odd numbers is %d%n", sumOdd);
    }
}
