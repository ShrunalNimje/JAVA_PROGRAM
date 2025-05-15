package com.company;

class SuperClass1{

    public SuperClass1(){
        System.out.println("This is SuperClass constructor");
    }

    public SuperClass1(int a){
        System.out.println("This is overloaded SuperClass constructor:"+a);
    }
}

class SubClass1 extends SuperClass1{

    public SubClass1(){
        // super(5);
        System.out.println("This is SubClass constructor");
    }

    public SubClass1(int a ,int b){
        super(a);
        System.out.println("This is overloaded SubClass constructor:"+b);
    }
}

class ChildOfSubClass extends SubClass1{

    public ChildOfSubClass(){
        System.out.println("This is child of SubClass constructor");
    }

    public ChildOfSubClass(int a,int b,int c){
        super(a,b);
        System.out.println("This is overloaded child of SubClass constructor:"+c);
    }
}

public class Ch10_Lec2 {
    public static void main(String[] args) {

         SuperClass1 sc = new SuperClass1();

         SubClass1 sc1 = new SubClass1();
         SubClass1 sc2 = new SubClass1(5,8);

         ChildOfSubClass cos = new ChildOfSubClass();
         ChildOfSubClass cos1 = new ChildOfSubClass(3,5,8);

    }
}
