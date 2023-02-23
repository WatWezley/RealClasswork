package chapterThree;

import java.util.Scanner;

public class HeartRateApp {
    public static void main(String[] args) {

        HeartRate patient = new HeartRate("0","0","0","0","0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        patient.setFirstName(firstName);

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        patient.setLastName(lastName);

        System.out.println("Enter day of birth:");
        String day = scanner.nextLine();
        patient.setDay(day);

        System.out.println("Enter month of birth:");
        String month = scanner.nextLine();
        patient.setDay(month);

        System.out.println("Enter year of birth:");
        String year = scanner.nextLine();
        patient.setYears(year);

        System.out.println(patient.getLastName() +patient.getFirstName());
        System.out.println(patient.dateOfBirth());
        System.out.printf("Age of the patient is %d%n", patient.age());
        System.out.printf("Your maximum HeartRate is %d%n", patient.maximumHeartRate(patient.age()));
        System.out.printf("Your target HeartRate is %s ", patient.targetHeartRate(patient.maximumHeartRate(patient.age())));

    }
}
