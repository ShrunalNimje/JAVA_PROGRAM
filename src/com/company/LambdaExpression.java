package com.company;

@FunctionalInterface
interface int1 {
    void nothing();
}

@FunctionalInterface
interface int2 {
    void everything(int i);
}

@FunctionalInterface
interface int3 {
    int sum(int i, int j);
}

public class LambdaExpression {
    public static void main(String[] args) {
        int1 i1 = () -> System.out.println("Nothing i1");
        i1.nothing();

        int2 i2 = i -> System.out.println("i: " + i);
        i2.everything(2);

        int3 i3 = Integer::sum; // method reference
        System.out.println("Sum is: " + i3.sum(2,4));
    }
}
