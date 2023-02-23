package chapterTwo;

import java.util.Scanner;
	
	public class Exercise215 {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int p = input.nextInt();

	System.out.print("Enter second integer: ");
	int q = input.nextInt();

	int psq = p * p ;
	int qsq = q * q ;
	int r = psq + qsq ;
	int d = psq - qsq ;

	System.out.printf(" Square of p is %d%n", psq);
	System.out.printf(" Square of q is %d%n", qsq);
	System.out.printf(" Sum of psq and qsq is %d%n", r);
	System.out.printf(" Difference of psq and qsq is %d%n", d);




}


}