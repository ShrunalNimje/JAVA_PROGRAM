package com.company;

import java.util.Optional;

public class OptionalClass {

    // without using Optional return type
    public static String findName() {
        return null;
    }

    // with using optional return type
    public static Optional<String> getName() {
        String name = "Shrunal";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {

        // without using Optional return type
        String name = findName();
        if(name != null) {
            System.out.println(name.toUpperCase());
        }

        // with using optional return type
        Optional<String> name1 = getName();
        Optional<Integer> length = name1.map(x -> x.length());

        if(name1.isPresent()) {
            System.out.println(length.get());
        }

        name1.ifPresent(System.out::println);

    }
}
