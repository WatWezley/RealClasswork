package Chapter17;

import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(Stream.iterate(1,(number)->number+2)
                .anyMatch((number)-> number%2!=0));


    }
}
