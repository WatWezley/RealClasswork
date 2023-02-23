package chapterTwo;
import java.util.Scanner;

	public class BMI{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter weightInKg : ");
	
	int weightInKg = input.nextInt() ;

	System.out.print("Enter heightInKg : ");
	
	int heightInkg = input.nextInt() ; 

	double BMI = weightInKg/(heightInkg * heightInkg) ;


	if( BMI < 18.5 ) {
		System.out.println("Under Weight") ;

	}

	if ( BMI > 18.5 && BMI > 25) {
		System.out.println("Under Weight") ;
	} 

	if ( BMI > 25 && BMI > 3) {
		System.out.println("Under Weight") ;
	}

	}
}