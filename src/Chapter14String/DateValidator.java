package Chapter14String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Scanner;

import static com.sun.tools.javac.util.Constants.format;

public class DateValidator {

    private static String date ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date: ");
        String date = scanner.nextLine();
        System.out.println(dateValidator(date));

    }



    public static String convert(String date){
        String[] splitDate = date.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(splitDate[2]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[0]));
        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(localDate);
    }
    public static String convert2(String date){
        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    public static String dateValidator(String date){

        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        return localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
}
