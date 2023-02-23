package chapterTwo;

import java.util.Scanner;

public class Return {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter First Number: ");
	int Number1 = input.nextInt();

	System.out.print("Enter Second Number: ");
	int Number2 = input.nextInt();
	 
	int P2 = (Number1%6 );

	int Q2 = (Number2%6 );


	if( Number1==Number2){
		System.out.println("Result: 0");
		}

	if( Number1<Number2){
		System.out.printf(" The larger number is: %d%n", Number2);
		}

	else if( Number1>Number2){
		System.out.printf("The larger number is: %d%n", Number1);
		}
	
	 if( P2==Q2 && Number1<Number2){
		System.out.printf("The Smaller number is: %d%n", Number1);
		}

	else if( P2==Q2 && Number1>Number2){
		System.out.printf("The Smaller number is: %d%n", Number2);
		}

	}

	}