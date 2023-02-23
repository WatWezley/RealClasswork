package chapterfive;

public class DiamondPrinter {
    public static void main(String[] args) {

        int space = 4;
        for (int column = 1; column <= 9; column += 2) {

            for (int row = 1; row <= space; row++) {
                System.out.print(" ");
            }

            for (int asterisks = 1; asterisks <= column; asterisks++) {
                System.out.print("*");

            }
            System.out.println();
            space--;

        }
        int blank = 1;
        for (int belowTriangle = 7; belowTriangle > 0; belowTriangle -= 2) {
            for (int row = 1; row <= blank; row ++) {
                System.out.print(" ");
            }
            for (int asterisk = belowTriangle; asterisk > 0; asterisk -- ) {
                System.out.print("*");
            }
            System.out.println();
            blank++;
            }
        }
}



