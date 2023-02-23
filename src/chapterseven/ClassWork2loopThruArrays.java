package chapterseven;

import java.util.Arrays;

public class ClassWork2loopThruArrays {

    public static void main(String[] args) {


        int[][] numbers = new int[3][3];
        int rows = 0;
        int fillNumber = 1;

        for (rows = 0; rows < 3; rows++) {
            int column = 0;
            for (column = 0; column < 3; column++) {
                numbers[rows][column] = fillNumber;
                fillNumber++;
            }

        }
        System.out.println(Arrays.deepToString(numbers));
    }
}