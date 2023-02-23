package chapterNineAndTen;

import java.util.Arrays;

public class ArrayList implements List {

    public int[] array;
    int[] newArray;

    int counter = 0;

    int capacity = 3;

    public ArrayList() {
        array = new int[capacity];


    }

    @Override
    public int[] add(int i) {
        array[counter] = i;
        counter++;
        expandArray();
        return array;
    }


    @Override
    public int[] add(int i, int i1) {
        int[] array2 = new int[counter + 1];
        System.arraycopy(array, i1, array2, (i1) + 1, counter - i1);
        array[i1] = i;
        System.arraycopy(array2, (i1) + 1, array, (i1) + 1, counter - i1);
        counter++;
        expandArray();
        return array;
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public void remove(int i) {
        if (counter== 0) throw new IllegalArgumentException("INDEX OUT OF BOUND");
        int index =getIndexOf(i) ;
        int[] array2 = new int[counter+1];
        System.arraycopy(array, index+1, array2, index, counter - index);
        System.arraycopy(array2, index, array, index, counter - index);
        counter--;

    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public int get(int i) {
        return array[i];
    }

    @Override
    public int getIndexOf(int i) {
        int index ;
        for (index=0; index < array.length; index++) {
            if(array[index] == i){
                return index ;
            }

        }return index;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    public void expandArray() {
        if (counter == capacity) {
            capacity = (int) (capacity * 2);
            newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, counter);
            //return newArray;
            array = newArray;
            System.arraycopy(newArray, 0, array, 0, counter+1);

        }

    }
}
