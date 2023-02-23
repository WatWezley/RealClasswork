package chapterTwo;

import java.util.Scanner;

	public class Comparism216 {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print(" Enter one integer: ");
	int NumberP = input.nextInt();
	int NumberPsq = NumberP * NumberP ;
	
	if ( NumberP == 100 ){
	System.out.printf("%d == %d%n ", NumberP , 100);
	}

	
	if ( NumberP != 100 ){
	System.out.printf("%d != %d%n ", NumberP , 100);
	}

	if ( NumberP < 100 ){
	System.out.printf("%d < %d%n ", NumberP , 100);
	}

	if ( NumberP > 100 ){
	System.out.printf("%d > %d%n ", NumberP , 100);
	}

	
	if ( NumberPsq == 100 ){
	System.out.printf("%d == %d%n ", NumberPsq , 100);
	}

	
	if ( NumberPsq != 100 ){
	System.out.printf("%d != %d%n ", NumberPsq , 100);
	}

	if ( NumberPsq < 100 ){
	System.out.printf("%d < %d%n ", NumberPsq , 100);
	}

	if ( NumberPsq > 100 ){
	System.out.printf("%d > %d%n ", NumberPsq , 100);
	}


}




}