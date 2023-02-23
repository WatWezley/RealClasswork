package chapterTwo;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter A : ");
	int A = input.nextInt();

	System.out.print("Enter B : ");
	int B = input.nextInt();

	int C = ( A * 3);
	System.out.printf("Triple of %d is %d%n", A, C);	

	int D = ( B * 2);
	System.out.printf("Double of %d is %d%n", B, D);

	if ( C % D == 0 ){
		System.out.printf("%d is a Multiple of %d%n", C, D);
		}

	else {
		System.out.println("Not a Multple");
		}

	}



}