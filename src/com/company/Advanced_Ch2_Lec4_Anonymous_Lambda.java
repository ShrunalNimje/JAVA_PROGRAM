package com.company;

@FunctionalInterface
interface MyInterface{
    public void meth1();
//    public void meth2();
}

//class MyClass1 implements MyInterface{
//    public void meth(){
//        System.out.println("I am  meth");
//    }
//
//    @Override
//    public void meth1(){
//        System.out.println("I am implemented meth1");
//    }
//
//    @Override
//    public void meth2(){
//        System.out.println("I am implemented meth2");
//    }
//
//}

public class Advanced_Ch2_Lec4_Anonymous_Lambda {
    public static void main(String[] args) {

//        MyInterface mi = new MyClass1();
//        mi.meth1();
//        mi.meth2();

        /*
        In an anonymous class we don't have to create class & their object
        We can simply override the method of interface & call by using object of anonymous class
        But Anonymous class can be use only for a one time
         */
        // Anonymous Class...
        MyInterface mi = new MyInterface() {
            @Override
            public void meth1() {
                System.out.println("I am meth1 of anonymous class");
            }

//            @Override
//            public void meth2() {
//                System.out.println("I am meth2 of anonymous class");
//            }
        };
        mi.meth1();
//        mi.meth2();

        /*
        Lambda expressions are similar to methods
        But they do not need a name, and they can be implemented right in the body of a method.
         */
        // Lambda Expression
        MyInterface mi1 = ()->{
            System.out.println("Hii, This is meth1 by using lambda expression ");
        };
        mi1.meth1();

    }
}