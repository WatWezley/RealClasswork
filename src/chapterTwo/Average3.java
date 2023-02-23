package chapterTwo;

import java.util.Scanner;

public class Average3 {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter NumberP: ");
	int NumberP = input.nextInt();

	System.out.print("Enter NumberQ: ");
	int NumberQ = input.nextInt();

	System.out.print("Enter NumberR: ");
	int NumberR = input.nextInt();

	int Sum = (NumberP + NumberQ + NumberR);
	int Average = Sum / 3;

	System.out.printf(" Average is %d%n ", Average);


	}


}