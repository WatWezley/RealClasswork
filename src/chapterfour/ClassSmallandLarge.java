package chapterfour;
import java.util.Scanner;

public class ClassSmallandLarge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int largest = number;
        int smallest = number;

          do {
              if (largest > number)  largest = number;

              if (smallest < number)  smallest = number;

              System.out.print("Enter another number : ");
               number = input.nextInt();
          }

                 while (number != 0);

          System.out.printf("the largest number is %d%n", largest);
          System.out.printf("the smallest number is %d%n", smallest);
            }
        }





