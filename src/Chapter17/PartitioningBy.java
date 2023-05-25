package Chapter17;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitioningBy {

    public static void main(String[] args) {
        List<String> names = List.of(
                "Favour", "Miracle", "Barachael", "Jethro"
        );
        Map<Boolean, List<String>> map = names.stream()
                .collect(Collectors.partitioningBy((w) -> w.length() % 2 == 0));
        System.out.println("LIST:: " + map);


        Map<Boolean, Set<String>> map1 = names.stream()
                .collect(Collectors.partitioningBy((w) -> w.length() % 2 == 0, Collectors.toSet()));
        System.out.println("SET:: " + map1);
    }
}
