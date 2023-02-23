package classWork;

import java.util.Scanner;

public class NumberSampleApp {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        NumberSample ugo = new NumberSample(0,0,0,0,0);

        System.out.print("Enter option1 for even set of number or option2 for odd set of number:");
        int option = scanner.nextInt();

        System.out.print(" Enter a set of  5 similar Numbers with a different number:");
        int numberA = scanner.nextInt();
        ugo.setA(numberA);
        int numberB = scanner.nextInt();
        ugo.setB(numberB);
        int numberC = scanner.nextInt();
        ugo.setC(numberC);
        int numberD = scanner.nextInt();
        ugo.setD(numberD);
        int numberE = scanner.nextInt();
        ugo.setE(numberE);

        System.out.println(ugo.chooseOption(option));

    }
}
