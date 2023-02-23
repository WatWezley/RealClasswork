package chapterTwo;

import java.util.Scanner;

	public class EvenOdd{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number :");

	int number1 = input.nextInt();

	int number2 = (number1 % 2);

	if( number2 == 0){
 	System.out.printf( "%d is an Even number", number1);
	}

	else 
	{
	System.out.printf( "%d is an Odd number", number1);
	}



	}

}	