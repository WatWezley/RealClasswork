package chapterTwo;

import java.util.Scanner;

	public class Feet{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value in feet:  ");

	double Feet = input.nextDouble();
	
	double Meter = Feet*0.305 ;

	System.out.printf("%f feet is %f meters", Feet, Meter);

	}

}