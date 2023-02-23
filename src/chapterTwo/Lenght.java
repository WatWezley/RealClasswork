package chapterTwo;

import java.util.Scanner;

	public class Lenght{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Speed and Acceleration:  ");


	double Speed = input.nextDouble() ;
	double Acceleration = input.nextDouble();
	
	double Lenght = (Speed*Speed)/(2*Acceleration);

	System.out.printf("The minimum runway lenght for this airplane is %f", Lenght );

	}

	
	}