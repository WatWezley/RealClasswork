package chapterTwo;

import java.util.Scanner;

	public class Years{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print( "Enter Number of Minutes: ");
	int Minutes = input.nextInt();

	int Hours = Minutes/60 ;

	int Days = Hours/24 ;

	int Years = Days/365 ;

	int ExtraDays = Years%365 ;

	System.out.printf("%d minutes is approximately %d years and %d days", Minutes,Years,ExtraDays);

	}

	}


