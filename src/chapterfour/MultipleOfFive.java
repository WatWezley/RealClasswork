package chapterfour;

import java.util.Scanner;

public class MultipleOfFive {

    public static void main(String[] args) {
        Scanner five = new Scanner(System.in);
        System.out.print( "Enter a number:  ");
        int number = five.nextInt();
        int factorCounter = 1;

        while (factorCounter <= 12){
            int product = number*factorCounter;
            System.out.printf("%d times %d is %d%n", number, factorCounter,product);
            factorCounter = factorCounter + 1;
        }

    }

    public static class LargestAndSmallest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double largestValue = Double.NEGATIVE_INFINITY;
            double smallestValue = Double.POSITIVE_INFINITY;
            int valueCounter = 1;


            while (true)
            {
            System.out.print("Enter positive value or a 0 to quit:  ");
            int number = input.nextInt();


                if (largestValue < number) {
                    largestValue = number;
                    }
                if (smallestValue > number) {
                    smallestValue = number;
                     }
                    valueCounter = valueCounter + 1;

                if(number == 0) {
                    System.out.printf("The highest number is %.2f%n", largestValue);
                    System.out.printf("The lowest number is %.2f%n", smallestValue);
                    break;
        }

    }
    }
    }
}
