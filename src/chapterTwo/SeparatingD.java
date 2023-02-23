package chapterTwo;

import java.util.Scanner;

public class SeparatingD {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter A: ");
	int A = input.nextInt();

	System.out.print("Enter B: ");
	int B = input.nextInt();

	System.out.print("Enter C: ");
	int C = input.nextInt();

	System.out.print("Enter D: ");
	int D = input.nextInt();

	System.out.print("Enter E: ");
	int E = input.nextInt();

	System.out.printf(" %d   %d   %d   %d   %d%n" , A, B, C, D, E);

	}

}