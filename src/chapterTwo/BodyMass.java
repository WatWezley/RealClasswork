package chapterTwo;

import java.util.Scanner;

public class BodyMass {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter Weight: ");
	int Weight = input.nextInt(); 

	System.out.print("Enter HeightInKg: ");
	int HeightInkg = input.nextInt(); 

	double Bmi = (Weight)/(HeightInkg * HeightInkg) ;

	System.out.printf("%f%n", Bmi);

	if(Bmi < 18.5 ){
		System.out.print("Under Weight");
		}

	
	else if(Bmi > 18.5 && Bmi < 25){
		System.out.print("Healthy Weight");
		} 


	else if (Bmi > 25 && Bmi < 30){
		System.out.print("Over Weight");
	} 

	}

}