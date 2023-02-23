package chapterseven;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        int [] numbers = new int [5];
        numbers [0] = 78;
        numbers [1] = 54;
        numbers [2] = 34;
        numbers [3] = 14;
        numbers [4] = 73;
        for (int i = 0;i< numbers.length;i++){
        System.out.println(Arrays.toString(new int[]{numbers[i]}));}

       //replacing elements in an array
        numbers[0] = numbers[4];
        System.out.println(Arrays.toString(new int[]{numbers[0]}));
        System.out.println(Arrays.toString(numbers));
    }
}
