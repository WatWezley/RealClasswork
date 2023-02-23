package chapterTwo;

import java.util.Scanner;

	public class AreaTriangle{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter x1, y1, x2, y2, x3 and y3:  ");

	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double x3 = input.nextDouble();
	double y3 = input.nextDouble();
	
	double s1 = ( y2-y3 );
	double s2 = ( y3-y1 );
	double s3 = ( y1-y2 );
	double S  = ((x1*s1)+(x2*s2)+(x3*s3));

	double Area = S/2;

	System.out.printf(" the Area of the Triangle is %f%n", Area);



 }


}