package chapter16;

import java.util.LinkedList;
import java.util.Queue;

public class Collection {

    public static void main(String[] args) {

        Queue<Integer> collection = new LinkedList<>();

        collection.add(11);
        collection.add(12);
        collection.add(13);
        collection.add(14);

        System.out.println(collection.getClass());
    }
}
