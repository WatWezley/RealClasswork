package chapterTwo;

import java.util.Scanner;

public class CheckEquality {

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

	
	if( NumberP==NumberQ && NumberQ==NumberR && NumberR==NumberS ){
		System.out.printf("Numbers are Equal");
		}

	
	else {
		System.out.printf("Numbers are not Equal");
		}

	}
	
	}

