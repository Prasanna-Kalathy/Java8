package com.Streams.Creation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectionStreams {
    public static void main(String[] args) {

        // Collections and Array
        // 1
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = lst.stream();
        // 2
        Integer[] intArr = { 300, 4100, 100, 3500 };
        Stream<Integer> intStream = Arrays.stream(intArr);
        System.out.println(intStream);

        // Stream Interface
        // 3
        Stream<String> strStream = Stream.of("A", "B", "C", "D", "E");
        // 4
        Stream<String> strStream2 = Stream.empty();
        // 5
        Stream<String> builderStream = Stream.<String>builder().add("first").add("second").add("third").build();

        // Infinite Streams
        // 6
        Stream<Double> generateStream = Stream.generate(Math::random);
        // 7
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 2);

        // Special Cases
        // 8
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        Stream<String> iteratorStream = StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(iterator, 0), false);
        // 9
        IntStream intstream = IntStream.of(-7);
        IntStream intrngstream = IntStream.range(5, 10);
    }
}
