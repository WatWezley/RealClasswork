package chapterTwo;

import java.util.Scanner;

public class Compare3 {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter NumberP: ");
	int NumberP = input.nextInt();

	System.out.print("Enter NumberQ: ");
	int NumberQ = input.nextInt();

	System.out.print("Enter NumberR: ");
	int NumberR = input.nextInt();

	int Sum = (NumberP + NumberQ + NumberR);
	int Product = (NumberP * NumberQ * NumberR);
	int Average = Sum / 3;

	System.out.printf(" Sum is %d%n ", Sum);
  	System.out.printf(" Product is %d%n ", Product);
	System.out.printf(" Average is %d%n ", Average);

	
	if( NumberP > NumberQ && NumberP > NumberR){
		System.out.printf("Largest number is the %d%n", NumberP);
		}

	else if(NumberQ > NumberR){
		System.out.printf("Largest number is the %d%n", NumberQ);
		} 
	
	else {
		System.out.printf("Largest number is the %d%n", NumberR);
		}

	if( NumberP < NumberQ && NumberP < NumberR){
		System.out.printf("Smallest number is the %d%n", NumberP);
		}

	else if(NumberQ < NumberR){
		System.out.printf("Smallest number is the %d%n", NumberQ);
		} 
	
	else {
		System.out.printf("Smallest number is the %d%n", NumberR);
		}
	
	}





}