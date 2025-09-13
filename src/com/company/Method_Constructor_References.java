package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class dummyClass {

    String name;

    public dummyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Method_Constructor_References {

    public static void getName(String s) {
        System.out.println(s);
    }

    public void getName1(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Shrunal", "Santosh", "Harsh");

        // without using method reference
        names.forEach(x -> System.out.println(x));

        // with using method reference - static
        names.forEach(Method_Constructor_References::getName);

        // with using method reference - non-static
        Method_Constructor_References references = new Method_Constructor_References();
        names.forEach(references::getName1);

        // without using constructor reference
        List<dummyClass> name = names.stream().map(x -> new dummyClass(x)).collect(Collectors.toList());

        // with using constructor reference
        List<dummyClass> name1 = names.stream().map(dummyClass::new).toList();

    }
}
