package chaptersix;

import java.util.Scanner;

public class SportRecommendation {

    public static void main(String[] args) {
        Scanner sport = new Scanner(System.in);
        System.out.println("Enter today weather degree in celcius: ");
        int degrees = sport.nextInt();
        SportRecommender.sportChecking(degrees);
    }
}
