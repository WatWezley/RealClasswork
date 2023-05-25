package Chapter17;



import java.util.Random;
import java.util.stream.Stream;

public class FiniteStream {

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream1.forEach(System.out::println);


        Stream<Integer> stream2 = Stream.empty();
        stream2.forEach(System.out::println);

        Stream<Integer> S =  Stream.generate(()->new Random().nextInt())
                .limit(10);
        ///System.out.println(stream1.reduce(0,(x,y))->(x+y));



        Stream.iterate(1,(number)->number+4)
                .limit(10)
                .forEach(System.out::println);

        }


    }

