package chapterTwo;

import java.util.Scanner;

	public class SumDigits{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 0 and 1000 :  ");


	int Number = input.nextInt() ;

	int Number1 = Number/100;

	int Remainder = Number%100;

	int Number2 = Remainder/10;

	int Number3 = Remainder%10;

	int Sum = Number1 + Number2 +Number3;

	if (Number >= 1000 && Number < 0) {
   	System.out.print("Number must be max 3 digits and cannot be negative");
	}  
	
	else {
	System.out.printf("The sum of the digits is %d", Sum );
	}

	}

	
	}