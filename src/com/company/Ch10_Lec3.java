package com.company;
class EkClass{
    public int x;
    public int getX() {
        return x;
    }
    public EkClass(int a){
        System.out.println("I am a  EkClass constructor "+a+" times bla bla bla...");
        this.x = a;
    }
}
class DoClass extends EkClass{
    int y;
    public int getY() {
        return y;
    }
    public DoClass(int b){
        super(6);
        System.out.println("I am a DoClass constructor "+b+" times bla bla bla...");
        this.y = b;
    }
}
public class Ch10_Lec3 {
    public static void main(String[] args) {
        // this and super keywords...

        // EkClass ec = new EkClass(34);
        // System.out.println(ec.getX());
        DoClass dc = new DoClass(45);
        System.out.println(dc.getX());
    }
}
