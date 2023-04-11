package chapterseven;

public class ThreeNumbers {

    public int sumOfConsecutiveNumber(int number, int sumOfNumber,int index) {
        int sum = 0;
        int counter;
        int start = (sumOfNumber/number)-1;
        int stop = (start-1) + number;
        int indexOfNumber = start + index;
        for ( counter = start; counter <= stop; counter++) {
                sum +=  counter;
            }
            if (sumOfNumber == sum) return indexOfNumber;
        return indexOfNumber;
    }
}



