package chapterfour;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number;
        //String name;
        do {
            System.out.print(" enter a five digit number:");
            number = scanner.nextLine();

            System.out.println(" enter name:");
            String name = scanner.nextLine();
        }
        while (number.length() != 5);


        for (int i = 0; i < number.length(); i++);
        if ((number.charAt(0) == number.charAt(4))&&(number.charAt(1) == number.charAt(3))){
            System.out.println("THIS IS A PALINDROME");}
            else{
                System.out.println("THIS IS NOT A PALINDROME");


            }


        }
    }
