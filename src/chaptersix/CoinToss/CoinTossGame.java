package chaptersix.CoinToss;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CoinTossGame {

        private static CoinGame game = new CoinGame();

        public static void main(String[] args) throws InterruptedException {
            Scanner scanner = new Scanner(System.in);
            System.out.println(CoinGame.getGameMenu());
            int usersInput = scanner.nextInt();
            System.out.println(usersInput);
            do {
                switch (usersInput){
                    case 1->game.flip();
                    case 2->goodbye();
                }
                System.out.println(CoinGame.getGameMenu());
                usersInput = scanner.nextInt();
            }while(usersInput>0&&usersInput<3);

        }

        private static void goodbye() throws InterruptedException {
            displayResult();
            //System.out.print("Shutting Down");
            //for (int counter = 0; counter < 5; counter++) {
                //TimeUnit.SECONDS.sleep(5);
                //System.out.print(".");
            String v ="SHUTTING DOWN";
            for (int counter = 0; counter < v.length(); counter++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.print(v.charAt(counter));
            } System.exit(0);
        }

        private static void displayResult(){
            game.displayGameResult();
        }
    }



