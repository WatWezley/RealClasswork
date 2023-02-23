package chapterTwo;

import java.util.Scanner;

public class Hexagon {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input the lenght of a side of the hexagon: ");
	int S = input.nextInt();
	 
	double P = (Math.PI/6 );

	double Area = (6*S*S)/(4*(Math.tan(P)));

	System.out.printf("The Area of the Hexagon: %f%n", Area);

	}

	}