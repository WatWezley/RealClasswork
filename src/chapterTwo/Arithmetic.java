package chapterTwo;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter P: ");
	int P = input.nextInt();

	System.out.print("Enter Q: ");
	int Q = input.nextInt();

	System.out.print("Enter R: ");
	int R = input.nextInt();

	System.out.print("Enter S: ");
	int S = input.nextInt();

	System.out.print("Enter T: ");
	int T = input.nextInt();

	
		if(P > Q &&  P > R && P > S && P > T){
		System.out.printf("Largest number is the %d%n", P);
		}

	else if(Q > R && Q > S && Q > T){
		System.out.printf("Largest number is the %d%n", Q);
		} 

	else if(R > S && R > T){
		System.out.printf("Largest number is the %d%n", R);
		}

	else if(S > T){
		System.out.printf("Largest number is the %d%n", S);
		} 
	
	else {
		System.out.printf("Largest number is the %d%n", T);
		}

	

		if(P < Q &&  P < R && P < S && P < T){
		System.out.printf("Smallest number is the %d%n", P);
		}

	else if(Q < R && Q < S && Q < T){
		System.out.printf("Smallest number is the %d%n", Q);
		} 

	else if(R < S && R < T){
		System.out.printf("Smallest number is the %d%n", R);
		}

	else if(S < T){
		System.out.printf("Smallest number is the %d%n", S);
		} 
	
	else {
		System.out.printf("Smallest number is the %d%n", T);
		}
	
	}





}