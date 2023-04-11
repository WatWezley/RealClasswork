package chapterseven;

import java.util.Arrays;

public class XAndOManipulation {

    public static void main(String[] args) {

        char[][] xos = new char[][]{{'X', 'O', 'X'}, {'O', 'O', 'X'}, {'X', 'O', 'O'}};
        displayXOs(xos);
        changingX(xos);
    }


    public static void displayXOs(char[][] xos) {
        for (char[] XO : xos) {
            System.out.println(Arrays.toString(XO));
        }
    }

    public static void changingX(char[][] xos) {
        for (int x = 0; x < xos.length;x++){
            for(int y = 0; y < xos[x].length;y++){
                if(xos[x][y]=='X'){
                    xos[x][y]='1';
                }
            }
        }
        displayXOs(xos);

    }

    }
