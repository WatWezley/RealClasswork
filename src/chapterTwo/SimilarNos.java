package chapterTwo;

import java.util.Scanner;

public class SimilarNos {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter First Integer from 45 to 75: ");
	int Number1 = input.nextInt();

	System.out.print("Enter Second Integer from 45 to 75: ");
	int Number2 = input.nextInt();
	 
	int P1 = (Number1/10 );

	int P2 = (Number1%10 );

	int Q1 = (Number2/10 );

	int Q2 = (Number2%10 );


	if( P1==Q1 || P1==Q2){
		System.out.println("TRUE");
		}

	else if ( P2==Q1 || P2==Q2){
		System.out.println("TRUE");
		}

	else {
		System.out.println("FALSE");
		}

	}

	}