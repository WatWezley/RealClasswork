package chapterTwo;

import java.util.Scanner;

public class Compare5 {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter NumberP: ");
	int NumberP = input.nextInt();

	System.out.print("Enter NumberQ: ");
	int NumberQ = input.nextInt();

	System.out.print("Enter NumberR: ");
	int NumberR = input.nextInt();

	System.out.print("Enter NumberS: ");
	int NumberS = input.nextInt();

	System.out.print("Enter NumberT: ");
	int NumberT = input.nextInt();

	
		if(NumberP > NumberQ &&  NumberP > NumberR && NumberP > NumberS && NumberP > NumberT)
		System.out.printf("Largest number is the %d%n", NumberP);
		

	else if(NumberQ > NumberR && NumberQ > NumberS && NumberQ > NumberT)
		System.out.printf("Largest number is the %d%n", NumberQ);
		

	else if(NumberR > NumberS && NumberR > NumberT){
		System.out.printf("Largest number is the %d%n", NumberR);
		}

	else if(NumberS > NumberT){
		System.out.printf("Largest number is the %d%n", NumberS);
		} 
	
	else {
		System.out.printf("Largest number is the %d%n", NumberT);
		}

	

		if(NumberP < NumberQ &&  NumberP < NumberR && NumberP < NumberS && NumberP < NumberT){
		System.out.printf("Smallest number is the %d%n", NumberP);
		}

	else if(NumberQ < NumberR && NumberQ < NumberS && NumberQ < NumberT){
		System.out.printf("Smallest number is the %d%n", NumberQ);
		} 

	else if(NumberR < NumberS && NumberR < NumberT){
		System.out.printf("Smallest number is the %d%n", NumberR);
		}

	else if(NumberS < NumberT){
		System.out.printf("Smallest number is the %d%n", NumberS);
		} 
	
	else {
		System.out.printf("Smallest number is the %d%n", NumberT);
		}
	
	}





}