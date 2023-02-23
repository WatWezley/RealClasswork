package chapterTwo;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Radius: ");
	int Radius = input.nextInt();
	
	double Diameter = ( 2 * Radius);

	double Circumference = (2 * Math.PI * Radius);

	double Area = ( Math.PI * Radius * Radius);


	System.out.printf(" Diameter is %f%n ", Diameter);
  	System.out.printf(" Circumference is %f%n ", Circumference);
	System.out.printf(" Area is %f%n ", Area);

	
	}


}