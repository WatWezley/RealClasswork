package chapterTwo;

import java.util.Scanner;

	public class Energy{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Amount of Water in Kilogram: ");
	double Mass = input.nextDouble();

	System.out.print("Enter intial temperature: ");
	double IT = input.nextDouble();

	System.out.print("Enter final temperature: ");
	double FT = input.nextDouble();

	double Energy = Mass*(FT - IT)*4184;

	System.out.printf("The Energy needed is %f%n",Energy);


}



}