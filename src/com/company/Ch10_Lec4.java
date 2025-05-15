package com.company;

class A{

    public int a;

    public int getA() {
        return a;
    }

    public int method1(int a) {
        System.out.println("I am a method of class A ");
        return a;
    }
}

class B extends A{

    public int b;

    public int getB() {
        return b;
    }

    @Override
    // Override method both class A & B have same method
    public int method1(int b){
        System.out.println("I am a method of class B ");
        return b;
    }
}

public class Ch10_Lec4 {
    public static void main(String[] args) {

        A aa  = new A();
        aa.method1(45);

        B bb  = new B();
        System.out.println(bb.method1(54));
    }
}
