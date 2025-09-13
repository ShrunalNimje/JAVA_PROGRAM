package com.company;

interface Greeting {
    void sayHello();
}

abstract class Animal1 {
    abstract void sound();
}

class Printer {
    void print() {
        System.out.println("Printing...");
    }
}

interface Greeting1 {
    void sayHello1();
    void sayGoodbye1();
}

public class AnonymousClass {
    public static void main(String[] args) {

        // created anonymous class for interface with 1 abstract method
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };
        greeting.sayHello();

        // created anonymous class for abstract class with 1 abstract method
        Animal1 animal1 = new Animal1() {
            void sound() {
                System.out.println("Animal makes sound");
            }
        };
        animal1.sound();

        // created anonymous class for normal class with 1 method to override
        Printer printer = new Printer() {
            void print() {
                System.out.println("Printing from anonymous subclass");
            }
        };
        printer.print();

        // created anonymous class for interface with more than 1 abstract method
        Greeting1 greeting1 = new Greeting1() {
            public void sayHello1() {
                System.out.println("Hello!");
            }

            public void sayGoodbye1() {
                System.out.println("Goodbye!");
            }
        };
        greeting1.sayHello1();
        greeting1.sayGoodbye1();

    }
}
