package chapterseven;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
       int[] numbers = {-12, -12, -12, -12, -12};
       indexOfHighestAndLowest(numbers);

    }



        public static void indexOfHighestAndLowest(int[]numbers){

        ArrayList<Integer> number2 = new ArrayList<>();

        int highestNumber = Integer.MIN_VALUE;
        int lowestNumber = Integer.MAX_VALUE;
        int highIndex = 0;
        int lowIndex = 0;
        int sum = 0;


        for(int x = 0; x<numbers.length; x++){
            number2.add(x,numbers[x]);}
        for (int y = 0; y<number2.size();y++){
            number2.remove(y);
            for(int z=0; z<number2.size();z++){
                sum= sum + number2.get(z);}
                if (highestNumber<sum){
                    highIndex = y;
                   highestNumber=sum ;}
                else if(highestNumber == sum){
                    highIndex = highIndex;
                }
                else if(lowestNumber==sum){
                    lowIndex=lowIndex;
                }
                else if (lowestNumber>sum){
                    lowestNumber=sum;
                    lowIndex =y;
                }
                sum = 0;

            number2 = new ArrayList<>();
            for(int x = 0; x<numbers.length; x++){
                number2.add(x,numbers[x]);}
        }
        System.out.println("the highest sum is "+ highestNumber);
            System.out.println("the lowest sum is "+ lowestNumber );
            int [] lowHigh = new int[2];
            lowHigh[0]=lowIndex;
            lowHigh[1]=highIndex;

        System.out.println(Arrays.toString(lowHigh));

    }


}
