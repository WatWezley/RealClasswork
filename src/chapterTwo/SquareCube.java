package chapterTwo;

import java.util.Scanner;

public class SquareCube {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Number1: ");
	int Number1 = input.nextInt();

	System.out.print("Enter Number2: ");
	int Number2 = input.nextInt();

	System.out.print("Enter Number3: ");
	int Number3 = input.nextInt();

	System.out.print("Enter Number4: ");
	int Number4 = input.nextInt();

	System.out.print("Enter Number5: ");
	int Number5 = input.nextInt();

	System.out.print("Enter Number6: ");
	int Number6 = input.nextInt();

	System.out.print("Enter Number7: ");
	int Number7 = input.nextInt();

	System.out.print("Enter Number8: ");
	int Number8 = input.nextInt();

	System.out.print("Enter Number9: ");
	int Number9 = input.nextInt();

	System.out.print("Enter Number10: ");
	int Number10 = input.nextInt();

	System.out.println("  Number    Square      Cube                      ");
	System.out.printf("    %d        %d          %d%n ",  Number1   ,(Number1*Number1)   ,(Number1*Number1*Number1));
	System.out.printf("   %d        %d          %d%n ", Number2   ,(Number2*Number2)   ,(Number2*Number2*Number2));
	System.out.printf("   %d        %d          %d%n ", Number3   ,(Number3*Number3)   ,(Number3*Number3*Number3));
	System.out.printf("   %d        %d         %d%n ", Number4   ,(Number4*Number4)   ,(Number4*Number4*Number4));
	System.out.printf("   %d        %d         %d%n ", Number5   ,(Number5*Number5)   ,(Number5*Number5*Number5));
	System.out.printf("   %d        %d         %d%n ", Number6   ,(Number6*Number6)   ,(Number6*Number6*Number6));
	System.out.printf("   %d        %d         %d%n ", Number7   ,(Number7*Number7)   ,(Number7*Number7*Number7));
	System.out.printf("   %d        %d         %d%n ", Number8   ,(Number8*Number8)   ,(Number8*Number8*Number8));
	System.out.printf("   %d        %d         %d%n ", Number9   ,(Number9*Number9)   ,(Number9*Number9*Number9));
	System.out.printf("   %d       %d        %d%n ", Number10  ,(Number10*Number10) ,(Number10*Number10*Number10));




	}

}