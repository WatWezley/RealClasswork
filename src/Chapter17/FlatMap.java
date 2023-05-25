package Chapter17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {


        List <String> names = List.of("Favour", "Miracle","Barachael","Jethros");
      names.stream()
                .flatMap(name-> Stream.of(name.split("")))
                        .forEach(System.out::print);
        System.out.println();

        System.out.println(names.stream()
                .flatMap(name-> Stream.of(name.split("")))
                .collect(Collectors.toList()));

        List<String>  names1 = names.stream()
                .flatMap(name-> Stream.of(name.split("")))
                .toList();
        System.out.println(names1);





    }
}
