package chapterTwo;

import java.util.Scanner;

	public class Velocity{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter v0, v1 and t : ");
	int v0 = input.nextInt(); 
	int v1 = input.nextInt(); 
	int t = input.nextInt();

	double Speed = (v1) - (v0);

	double Acceleration = Speed/t ;

	System.out.printf("The average accerelation is %f%n" , Acceleration );
 	
	} 

	

	}

	