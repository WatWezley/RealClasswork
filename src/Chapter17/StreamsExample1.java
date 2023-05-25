package Chapter17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample1 {

    public static void main(String[] args) {

        List <Integer> list = List.of(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        List<Integer> list1 = stream.filter((number)->number%2==0)
                .collect(Collectors.toList());
        System.out.println(list1);

    }
}
