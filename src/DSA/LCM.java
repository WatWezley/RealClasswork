package DSA;

import java.util.Arrays;

public class LCM {

    public static int[] calculatingLcm(int number){
        int counter = 1;
        int [] multiples = new int [counter];
        int result = number;
        do{
            for(int x = 2; x <= result; x++){

                if (result % x == 0) {
                    result /= x;


                    if (counter > multiples.length) {
                        int[] multiples2 = new int[multiples.length];
                        System.out.println(Arrays.toString(multiples2));
                        System.arraycopy( multiples, 0, multiples2, 0, multiples.length);
                        System.out.println(Arrays.toString(multiples2));
                        multiples = new int[counter];
                        System.arraycopy(multiples2, 0, multiples, 0, multiples2.length);
                        System.out.println(Arrays.toString(multiples));
                    }
                    multiples[counter-1] = x;
                    System.out.println(Arrays.toString(multiples));
                    counter++;
                    x = 1;
                }

            }
            }while(result!=1);
        return multiples;
    }

    public static void main(String[] args) {
        int number = 620;
        int [] numbers = calculatingLcm(number);
        System.out.println(Arrays.toString(numbers));
        }
    }






