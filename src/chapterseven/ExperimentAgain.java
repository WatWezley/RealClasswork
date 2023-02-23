package chapterseven;

import java.util.Scanner;

public class ExperimentAgain {
    public static void main(String[] args) {

        //ArrayList<String> item = new ArrayList<String>();
        int counter = 1;

        Scanner scanner = new Scanner(System.in);
        int buy;
        int response;


        do {
            System.out.print("Enter item to buy :");
            buy = scanner.nextInt();


            System.out.println("for another purchase(1), to end(0):");
            response = scanner.nextInt();

        }
        while (response != 0);


    }
}
