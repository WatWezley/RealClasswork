package chapterfive;

import java.util.Scanner;

public class Menu {


    public String phoneBook() {

        System.out.println("""
                1. Search
                2. Service Nos
                3. Add name
                4. Erase
                5. Edit
                6. Assign Tone
                7. Send b'card
                8. Options
                9. Speed dials
                10.Voice tags
                """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Option:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos");
                break;
            case 3:
                System.out.println("Add Name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign Tone");
                break;
            case 7:
                System.out.println("Send b'card");
                break;
            case 8:
                System.out.println("""
                        1. Type of views
                        2. Memory Status
                        """);
                System.out.println("Enter an option:");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Type of view");
                        break;
                    case 2:
                        System.out.println("Memory Status");
                        break;
                }
                break;
            case 9:
                System.out.println("Speed Dial");
                break;
            case 10:
                System.out.println("Voice Tags");
                break;
            default:
                System.out.println("Enter the correct options");
                break;
        }
        return null;
    }


    public String messages() {

        System.out.println("""
                1. Write Messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Template
                6. Smiley
                7. Messages settings
                8. Info service
                9. Voice mailbox number
                10.Service Command Editor
                """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Option:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Write Messages");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture Messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                messageSettings();
                break;
            case 8:
                System.out.println("Info Services");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service Command Editor");
                break;
            default:
                System.out.println("Enter the correct options");
                break;
        }
        return null;
    }

    public String messageSettings() {
        System.out.println("""
                1. Set
                2. Common
                """);
        System.out.println("Enter an option:");
        Scanner scanner = new Scanner(System.in);
        int option1 = scanner.nextInt();
        switch (option1) {
            case 1:
                System.out.println("""
                        1. Message centre number
                        2. Messages sent as
                        3. Messages validity
                        """);
                System.out.println("Enter an option:");
                int option2 = scanner.nextInt();
                switch (option2) {
                    case 1:
                        System.out.println("Message centre number");
                        break;
                    case 2:
                        System.out.println("Messages sent as");
                        break;
                    case 3:
                        System.out.println("Messages validity");
                        break;
                }
                break;
            case 2:
                System.out.println("""
                        1. Delivery Reports
                        2. Reply via same centre
                        3. Character support
                        """);
                System.out.println("Enter an option:");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Delivery Reports");
                        break;
                    case 2:
                        System.out.println("Reply via same centre");
                        break;
                    case 3:
                        System.out.println("Character support");
                        break;}
            default: System.out.println(" Enter the right option:");
                break;
                }

        return null;
    }


    public String callRegister() {
        System.out.println("""
                1. Missed Calls
                2. Received Calls
                3. Dialled Calls
                4. Erase Recent Call Lists
                5. Show Call Duration
                6. Show Call Costs
                7. Call Cost Settings
                8. Prepaid Credit
                            
                """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Option:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Missed Calls");
                break;
            case 2:
                System.out.println("Received Calls");
                break;
            case 3:
                System.out.println("Dialled Calls");
                break;
            case 4:
                System.out.println("Erase Recent Call Lists");
                break;
            case 5:
                showCallDuration();
                break;
            case 6:
                showCallCosts();
                break;
            case 7:
                callCostSettings();
                break;
            case 8:
                System.out.println("Prepaid Credit");
                break;
            default: System.out.println(" Enter the right option:");
                break;
        }
        return null;

    }


    private String callCostSettings() {
        System.out.println("""
                1. Call Cost Limit
                2. Show Cost in
              """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Option:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Call Cost Limit");
                break;
            case 2:
                System.out.println("Show Cost in");
                break;
            default: System.out.println(" Enter the right option:");
                break;}
        return null;
    }

    private String showCallCosts() {
        System.out.println("""
                1. Last Call Cost
                2. All Calls Cost
                3. Clear Counters            
                """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Option:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Last Call Cost");
                break;
            case 2:
                System.out.println("All Calls Cost");
                break;
            case 3:
                System.out.println("Clear Counters");
                break;
            default: System.out.println(" Enter the right option:");
                break;}
        return null;
    }

    private String  showCallDuration() {
        System.out.println("""
                1. Last Call Duration
                2. All Calls Duration
                3. Received Calls Duration
                4. Dialled Calls Duration
                5. Clear Timers
                 """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Option:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Last Call Duration");
                break;
            case 2:
                System.out.println("All Calls Duration");
                break;
            case 3:
                System.out.println(" Received Calls Duration");
                break;
            case 4:
                System.out.println("Dialled Calls Duration");
                break;
            case 5:
                System.out.println("Clear timer");;
                break;
            default: System.out.println(" Enter the right option:");
                break;
        }
        return null;
    }

public String tones(){
    System.out.println("""
                1. Ringing Tone
                2. Ringing Volume
                3. Incoming Call Alert
                4. Composer
                5. Message Alert Tone
                6. Keypad Tones
                7. Warning and Game Tones
                8. Vibrating Alert
                9. Screen Saver
                """);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an Option:");
    int input = scanner.nextInt();
    switch (input) {
        case 1:
            System.out.println("Ringing Tone");
            break;
        case 2:
            System.out.println("Ringing Volume");
            break;
        case 3:
            System.out.println("Incoming Call Alert");
            break;
        case 4:
            System.out.println("Composer");
            break;
        case 5:
            System.out.println("Message Alert Tone");
            break;
        case 6:
            System.out.println("Keypad Tones");
            break;
        case 7:
            System.out.println("Warning and Game Tones");
            break;
        case 8:
            System.out.println("Vibrating Alert");
            break;
        case 9:
            System.out.println("Screen Saver");
            break;
        default: System.out.println(" Enter the right option:");
            break;
    }
    return null;
}


public String settings(){
    System.out.println("""
                1. Call Settings
                2. Phone Settings
                3. Security Settings
                4. Restore Factory Settings
                 """);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an Option:");
    int input = scanner.nextInt();
    switch (input) {
        case 1:
            callSettings();
            break;
        case 2:
            phoneSettings();
            break;
        case 3:
            securitySettings();
            break;
        case 4:
            System.out.println("Restore Factory Settings");
            break;
        default: System.out.println(" Enter the right option:");
            break;}

    return null;
}


    private String callSettings() {
        System.out.println("""
                1. Automatic Redial
                2. Speed Dialing
                3. Call Waiting Options
                4. Own Number Sending
                5. Phone Line in Use
                6. Automatic Answer
                """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Option:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Automatic Redial");
                break;
            case 2:
                System.out.println("Speed Dialing");
                break;
            case 3:
                System.out.println("Call Waiting Options");
                break;
            case 4:
                System.out.println("Own Number Sending");
                break;
            case 5:
                System.out.println("Phone Line in Use");
                break;
            case 6:
                System.out.println("Automatic Answer");
                break;
            default: System.out.println(" Enter the right option:");
                break;}
        return null;
    }

    private String phoneSettings() {
        System.out.println("""
                1. Language
                2. Cell Info Display
                3. Welcome Note
                4. Network Selection
                5. Light
                6. Confirm SIM Service Action
                """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Option:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Language");
                break;
            case 2:
                System.out.println("Cell Info Display");
                break;
            case 3:
                System.out.println("Welcome Note");
                break;
            case 4:
                System.out.println("Network Selection");
                break;
            case 5:
                System.out.println("Light");
                break;
            case 6:
                System.out.println("Confirm SIM Service Action");
                break;
            default: System.out.println(" Enter the right option:");
                break;}
        return null;
    }

    private String securitySettings() {
        System.out.println("""
                1. Pin Code Request
                2. Call Barring Service
                3. Fixed Dialing
                4. Closed User Group
                5. Phone Security
                6. Change Access Codes
                """);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Option:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Pin Code Request");
                break;
            case 2:
                System.out.println("Call Barring Service");
                break;
            case 3:
                System.out.println("Fixed Dialing");
                break;
            case 4:
                System.out.println("Closed User Group");
                break;
            case 5:
                System.out.println("Phone Security");
                break;
            case 6:
                System.out.println("Change Access Codes");
                break;
            default: System.out.println(" Enter the right option:");
                break;}
        return null;
    }

    public String clock() {
            System.out.println("""
                1. Alarm Clock
                2. Clock Settings
                3. Date Setting
                4. Stopwatch
                5. Countdown Timer
                6. Auto Update of Date and Time
                """);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter an Option:");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Alarm Clock");
                    break;
                case 2:
                    System.out.println("Clock Settings");
                    break;
                case 3:
                    System.out.println("Date Setting");
                    break;
                case 4:
                    System.out.println("Stopwatch");
                    break;
                case 5:
                    System.out.println("Countdown Timer");
                    break;
                case 6:
                    System.out.println("Auto Update of Date and Time");
                    break;
                default: System.out.println(" Enter the right option:");
                    break;}
            return null;

    }

}


