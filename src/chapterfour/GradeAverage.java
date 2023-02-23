package chapterfour;

import java.util.Scanner;

public class GradeAverage {

        public static  void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            GradeAverageFnx ugo = new GradeAverageFnx();

            int sum = 0;
            int i = 0;
            for (i = 0; i < 10; i++) {
                System.out.printf("Enter %s grade: ",ugo.numberOfGrade(i));
                int grade = scanner.nextInt();
                sum = sum + grade;}


            double average = sum/i;
            System.out.println();
            System.out.println("The sum of the grade is "+ sum);
            System.out.printf("The average of the grade is %.2f", average);



        }
    }

