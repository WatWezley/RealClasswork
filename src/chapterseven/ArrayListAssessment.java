package chapterseven;

import java.util.ArrayList;

public class ArrayListAssessment {

    public static void main(String[] args) {

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(3);
        numbers.add(4);

        ArrayList<Integer> number2 = new ArrayList<>();
        number2 = numbers;
        numbers = new ArrayList<>();
        for (int i = number2.size()-1; i >= 0 ; i--) {
            int element = number2.get(i);
            numbers.add(element);}
        System.out.println(numbers.toString());

        }
    }

