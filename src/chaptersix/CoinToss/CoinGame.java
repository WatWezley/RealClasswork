package chaptersix.CoinToss;

import java.security.SecureRandom;
public class CoinGame {
        private int headsCount;
        private int tailsCount;
        private CoinToss coin;



        public static String getGameMenu() {
            return """
                1. Toss Coin
                2. Exit Game
                """;
        }


        public String flip() {
            int randomNumber= generateRandomNumberBetweenZeroAndOne();
            if (randomNumber==0) {
                headsCount++;
                return CoinToss.HEADS.name();
            }
                tailsCount++;
                return CoinToss.TAILS.name();
        }

        public int getHeadsCount() {
            return headsCount;
        }

        public int getTailsCount() {
            return tailsCount;
        }

        private static int generateRandomNumberBetweenZeroAndOne(){
            SecureRandom secureRandom = new SecureRandom();
            return secureRandom.nextInt(2);
        }

        public void displayGameResult(){
            int totalFlips = headsCount+tailsCount;
            System.out.printf("Total Tosses: %d\nHEADS: %d\nTAILS: %d%n",
                    totalFlips, headsCount, tailsCount);
        }
    }

