package Chapter17;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamAssessment {
    public static void main(String[] args) {

        List<String> names = List.of("Favour", "Miracle","Barachael","Jethros");
        System.out.println(names.stream().limit(3).reduce((x, y) -> y).get().length());


        System.out.println(names.stream().count());



    }
}
