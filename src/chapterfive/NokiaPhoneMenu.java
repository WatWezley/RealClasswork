package chapterfive;

import java.util.Scanner;

public class NokiaPhoneMenu {
    public static void main() {
        Menu nokia = new Menu();

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
                14. exit
                """);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Options:");
        int options = scanner.nextInt();

        switch (options) {
            case 1:
                nokia.phoneBook();
                break;
            case 2:
                nokia.messages();
                break;
            case 3:
                System.out.println("Chats");
                break;
            case 4:
                nokia.callRegister();
                break;
            case 5:
                nokia.tones();
                break;
            case 6:
                nokia.settings();
                break;
            case 7:
                System.out.println("Call Divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Remainders");
                break;
            case 11:
                nokia.clock();
                break;
            case 12:
                System.out.println("Profile");
                break;
            case 13:
                System.out.println("SIM Services");
                break;
            case 14:
                System.exit(0);
                break;
            default:
                main();


        }

    }


}
