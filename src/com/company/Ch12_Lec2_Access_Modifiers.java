package com.company;
class class1{
    // for when we use same package
    public int a = 1;
    protected float b= 2.3f;
    char c = 'A';
    private String d = "Shrunal";

    // when we use same class
    void method(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Ch12_Lec2_Access_Modifiers {
    public static void main(String[] args) {
        class1 c= new class1();
        // when we use same class
        c.method();
        // when we use same package
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        // System.out.println(c.d);  --> throws an error since we do not use private modifier in same package

        // subclass and world are done in VS Code...
    }
}
