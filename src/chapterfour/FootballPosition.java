package chapterfour;

import java.util.Scanner;

public class FootballPosition {

    public static void main(String[] args) {
        System.out.println("""
                1
                2
                3
                4
                5
                6
                7
                8
                9
                10
                11
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Footballers Number:");
        int jerseyNumber = scanner.nextInt();

        switch (jerseyNumber) {
            case 1 -> System.out.println("This is a Goal Keeper");
            case 2 -> System.out.println("This is a Right Wing Defender");
            case 3 -> System.out.println("This is a Left Wing Defender");
            case 4 -> System.out.println("This is a Defensive Midfielder");
            case 5, 10, 6 -> System.out.println("This is a Central Defender");
            case 7 -> System.out.println("This is a Right Wing Defender ");
            case 8 -> System.out.println("This is an Attacking Midfielder");
            case 9 -> System.out.println("This is a Central Attacker");
            case 11 -> System.out.println("This is a Left Wing Attacker");
            default -> System.out.println("Yon no Shebi Ball");
        }
    }
}
