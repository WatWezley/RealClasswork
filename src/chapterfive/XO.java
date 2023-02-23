package chapterfive;

public class XO {

    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 2;


        for (int row = 1; row <= 3; row++) {
            for (int column1 = 0; column1 < A; column1++) {
                System.out.print("O");
            }
            for (int column2 = -1; column2 < B; column2++) {
                System.out.print("X");
            }
            for (int column3 = 3; column3 >= C; column3--) {
                System.out.print("O");
            }
            System.out.println();
            A++;
            C++;
        }
        System.out.println();
        System.out.println();

        int AA = 2;
        int AB = 0;
        int AC = 0;

        for (int row2 = 1; row2 <= 3; row2++) {
            for (int column1A = 0; column1A < AA; column1A++) {
                System.out.print("O");
            }
            for (int column1B = -1; column1B < AB; column1B++) {
                System.out.print("X");
            }
            for (int column1C = 0; column1C < AC; column1C++) {
                System.out.print("O");
            }

            System.out.println();
            AA--;
            AC++;
        }

        System.out.println();
        System.out.println();

        for (int row3 = 1; row3 <= 3; row3++) {
            for (int column2A = 0; column2A < 1; column2A++) {
                System.out.print("O");
            }
            for (int column2B = 0; column2B < 1; column2B++) {
                System.out.print("X");
            }
            for (int column2C = 0; column2C < 1; column2C++) {
                System.out.print("O");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        int ca = 3;
        int cb = 0;
        int cc = 3;

        for (int row4 = 1; row4 <= 3; row4++) {
            for (int column3a = 1; column3a <= 3; column3a++) {

            }
        }

    }}
