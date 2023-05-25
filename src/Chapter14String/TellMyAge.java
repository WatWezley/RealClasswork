package Chapter14String;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TellMyAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date of birth eg 13/12/2004: ");
        String dob = scanner.nextLine();
        System.out.println(calculateMyAge(dob));
    }


    public static int calculateMyAge(String dob) {
        String [] year = dob.split("/");
        int yearOfBirth = Integer.parseInt(year[2]);
        if( LocalDateTime.now().getYear() < yearOfBirth) throw new IllegalArgumentException("This date of birth is invalid");
        else return LocalDateTime.now().getYear()-yearOfBirth ;
    }
}