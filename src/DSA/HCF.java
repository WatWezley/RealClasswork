package DSA;


import java.util.ArrayList;
;

public class HCF {

    public static void main(String[] args) {
    ArrayList<Integer> HCF = HcfComputation(36, 90, 270);
        System.out.println(HCF);

    }


    public static ArrayList<Integer> HcfComputation(int... numbers) {

        int divisor = 0;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> divisors;
        int[] numbers2 = new int[numbers.length];
        divisors = new ArrayList<>();
        numbers2 = numbers;

        for (int number : numbers) {
            if (number < min) min = number;
        }

        for (divisor = 2; divisor <= min; divisor++) {
            int count = 0;
            for (int element = 0; element < numbers2.length; element++) {
                if (numbers2[element] % divisor == 0) count++;
            }
            if (count == numbers2.length) {
                divisors.add(divisor);
                for (int element2 = 0; element2 < numbers2.length; element2++) {

                    int multiples = numbers2[element2] / divisor;
                    numbers2[element2] = multiples;
                }
                divisor = 2;
            }
        }


        return divisors;
    }
}
