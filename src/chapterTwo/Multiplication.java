package chapterTwo;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int X = input.nextInt();

	System.out.print("Enter second integer: ");
	int Y = input.nextInt();

	System.out.print("Enter thrid integer: ");
	int Z = input.nextInt();

	int product = 	X * Y * Z;

	System.out.printf("Product is %d%n", product);
	

	}


}