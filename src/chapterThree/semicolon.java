package chapterThree;

import java.util.Scanner;

public class semicolon {
    public static void main(String[] args){

        Native natives = new Native();
        Cohort student = new Cohort();
        Scanner ugo = new Scanner(System.in);

        System.out.print("enter a name: ");
        String name = ugo.nextLine();

        System.out.print("enter new payment: ");
        int newpayment = ugo.nextInt();

        natives.setName(name);
        System.out.println(natives.getName());


        natives.setPhoneNumber("08065378925");
        String herPhoneNumber = natives.getPhoneNumber();
        System.out.println(herPhoneNumber);


        student.updateCurrentCourse("Java");
        String herCurrentCourse = student.whatsCurrentCourse();
        System.out.println(herCurrentCourse);

        student.updatePeriod(" 2 months");
        String herPeriod = student.whatsPeriod();
        System.out.println(herPeriod);


        student.payment(newpayment);
        int herPayment = student.newPayment();
        System.out.println(herPayment);

        int schoolFees = (3500000);
        int balance = (3500000 - herPayment);
        System.out.printf(" Balance is %d%n ", balance);

    }


}

