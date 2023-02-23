package chapterTwo;

import java.util.Scanner;

public class WithMode {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter NumberP: ");
	int NumberP = input.nextInt();

	System.out.print("Enter NumberQ: ");
	int NumberQ = input.nextInt();


	int Sum = (NumberP + NumberQ );
	
	int Difference = (NumberP - NumberQ );

	int Product = (NumberP * NumberQ);
	 
	int Division = (NumberP/NumberQ );

	int Mod = (NumberP%NumberQ );


	System.out.printf("%d + %d = %d%n ", NumberP , NumberQ, Sum);
	System.out.printf("%d - %d = %d%n ", NumberP , NumberQ, Difference );
  	System.out.printf("%d * %d = %d%n ", NumberP , NumberQ, Product);
	System.out.printf("%d / %d = %d%n ", NumberP , NumberQ, Division);
	System.out.printf("%d mod %d = %d%n ", NumberP , NumberQ, Mod);

	}

}