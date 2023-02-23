package chapterfive;

public class DaysOfChristmas1 {

    public static void main(String[] args) {

        Christmas presents = new Christmas();

        int days = 1;
        for (days = 1; days <= 12; days++) {

            switch (days) {
                case 1 -> {
                    System.out.println("On the first day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();

                }
                case 2 -> {
                    System.out.println("On the second day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }


                case 3 -> {
                    System.out.println("On the third day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }

                case 4 -> {
                    System.out.println("On the fourth day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }

                case 5 -> {
                    System.out.println("On the fifth day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }

                case 6 -> {
                    System.out.println("On the sixth day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }

                case 7 -> {
                    System.out.println("On the seventh day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }

                case 8 -> {
                    System.out.println("On the eight day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }

                case 9 -> {
                    System.out.println("On the ninth day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }
                case 10 -> {
                    System.out.println("On the tenth day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }

                case 11 -> {
                    System.out.println("On the eleventh day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }

                case 12 -> {System.out.println("On the twelve day of christmas, my true love sent to me");
                    presents.gift(days);
                    System.out.println();
                }
            }


        }
    }
}
