package Chapter17;

import java.util.List;
import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5);
        var start = System.nanoTime();
        list.stream().filter((number)-> number%2!=0);

    }
}
