package chapterTwo;

import java.util.Scanner;

public class SolveThis {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter NumberP: ");
	int NumberP = input.nextInt();

	System.out.print("Enter NumberQ: ");
	int NumberQ = input.nextInt();


	int Sum = (NumberP + NumberQ );
	int Product = (NumberP * NumberQ);
	int Average = Sum / 2;
	int Difference = (NumberP - NumberQ ); 
	int Distance = (NumberP - NumberQ );

	System.out.printf(" Sum of two integers: %d%n ", Sum);
	System.out.printf(" Difference of two integers: %d%n ", Difference);
  	System.out.printf(" Product of two integers: %d%n ", Product);
	System.out.printf(" Average of two integers: %d%n ", Average);
	System.out.printf(" Distance of two integers: %d%n ", Distance);

	
	if( NumberP > NumberQ){
		System.out.printf("MAX integer: %d%n", NumberP);
		}

	else {
		System.out.printf("MAX integer: %d%n", NumberQ);
		} 

	if( NumberP < NumberQ){
		System.out.printf("MIN integer: %d%n", NumberP);
		}

	else {
		System.out.printf("MIN integer: %d%n", NumberQ);
		} 
	
	
	
	}





}