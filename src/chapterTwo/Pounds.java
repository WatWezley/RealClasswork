package chapterTwo;

import java.util.Scanner;

	public class Pounds{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Number in Pounds: ");

	double Number = input.nextDouble();

	double Kilogram = Number * 0.454 ;

	System.out.printf(" %f Pounds is %f Kilograms", Number, Kilogram);

	


}


}