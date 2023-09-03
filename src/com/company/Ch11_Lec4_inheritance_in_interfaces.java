package com.company;

interface One{
    public void meth1();
    public void meth2();
}
interface Two extends One{
    public void meth3();
    public void meth4();
}
class Three implements Two{
    public void meth3(){
        System.out.println("Meth 3...");
    }
    public void meth4(){
        System.out.println("Meth 4...");
    }
    public void meth1(){
        System.out.println("Meth 1...");
    }
    public void meth2(){
        System.out.println("Meth 2...");
    }
}
public class Ch11_Lec4_inheritance_in_interfaces {
    public static void main(String[] args) {
        Three tr = new Three();
        tr.meth1();
        tr.meth2();
        tr.meth3();
        tr.meth4();
    }
}
