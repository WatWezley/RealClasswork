package chapterfive;

import java.util.Scanner;

public class PhoneMenu {

    public static void main(String[] args) {
        Menu menu = new Menu();

        System.out.println("""
                1. phone number
                2. messages
                3. chats
                4. call register
                5. tones
                6. settings
                7. call divert
                8. games
                9. calculator
                10.reminder
                11.clock
                12.profiles
                13.sim service
                """);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Options:");
        int options = scanner.nextInt();

        switch (options) {
            case 1 : menu.phoneBook();
            break;
            case 2 : menu.messages();
            break;
            case 3 : System.out.println("Chats");
            break;
            case 4 : menu.callRegister();
            break;
            case 5 : menu.tones();
            break;
            case 6 :menu.settings();
            break;
            case 7 : System.out.println("Call Divert");
            break;
            case 8 : System.out.println("Games");
            break;
            case 9 : System.out.println("Calculator");
            break;
            case 10: System.out.println("Remainders");
            break;
            case 11: menu.clock();
            break;
            case 12: System.out.println("Profile");
            break;
            case 13: System.out.println("SIM Services");
            break;
            //default:menu.mainMenu();


        }

    }
}
