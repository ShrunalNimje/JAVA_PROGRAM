package com.company;
class Phone {
    public int Music(int a) {
        System.out.println("Sound/music of the Phone is " + a + "% times louder...");
        return a;
    }
    public int On(int b) {
        System.out.println("I tried to on this phone " + b + " times...");
        return b;
    }
}
class Smartphone extends Phone{
    public int Game(int c){
        System.out.println("Today I played game for "+c+"times...");
        return c;
    }
    public int On(int d){
        System.out.println("I tried to on this SmartPhone " + d + " times...");
        return d;
    }
}
public class Ch10_Lec5 {
    public static void main(String[] args) {
        /*
        Phone p = new Phone();
        p.Music(45);
        p.On(4);

        Smartphone sp = new Smartphone();
        sp.Game(5);
        sp.On(8);
        sp.Music(45);
         */

        // Dynamic method dispatch.......
        Phone ph = new Smartphone();
        ph.Music(45);
        // ph.Game();     it is invalid ... throws an error cause Game function is not in Super class
        ph.On(8);

    }
}
