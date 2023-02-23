package chapterTwo;

import java.util.Scanner;

	public class Palindrome{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter three digit number :");

	int number1 = input.nextInt();

	int number2 = number1 /100 ;

	int number3 = number1 % 10 ;

	if ( number2 == number3)

		{System.out.println("PALINDROME");
		
		}


	else 
		{System.out.println( "NOT PALIDROME");

		
		 }


	}






}