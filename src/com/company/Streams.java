package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Shrunal", "Harsh", "Santosh");
        Stream<String> listStream = list.stream();
        System.out.println(listStream);

        String [] arr = {"Shrunal", "Harsh", "Santosh"};
        Stream<String> arrStream = Arrays.stream(arr);
        System.out.println(arrStream);

        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(intStream);

        Stream<Integer> iteratorStream = Stream.iterate(1, n -> n * 2).limit(50);
        System.out.println(iteratorStream);

        Stream<Double> generatorStream = Stream.generate(() -> Math.random()).limit(10);
        System.out.println(generatorStream);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
        List<Integer> output = list1.stream()
                .filter(s -> s % 2 == 0)
                .map(s -> s / 4)
                .distinct()
                .sorted((a, b) -> (b - a))
                .limit(5)
                .skip(2)
                .peek(System.out::println)
                .toList();
        System.out.println(output);

        Long output1 = Stream.iterate(0, n -> n + 1).limit(5).skip(2).distinct().count();
        System.out.println(output1);
    }
}
