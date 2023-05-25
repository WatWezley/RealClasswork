package Chapter17;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector {
    public static void main(String[] args) {
        List<String> names = List.of("Favour", "Miracle","Barachael","Jethros");
        var wordLength =  names.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(wordLength);
    }
}
