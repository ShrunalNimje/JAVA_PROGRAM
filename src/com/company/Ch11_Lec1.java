package com.company;

// abstract class and methods...
abstract class Shape1{
    public int radius;
    public void setRadius(int r) {
        this.radius = r;
    }
    public int length;
    public void setLength(int l) {
        this.length = l;
    }
    public int breadth;
    public void setBreadth(int b) {
        this.breadth = b;
    }
    public int height;
    public void setHeight(int h) {
        this.height = h;
    }
    public Shape1(){
        System.out.println("Hello Shape...");
    }
    abstract double area();
    abstract double volume();
}
class Circle5 extends Shape1{
    @Override
    double area() {
       return Math.PI*radius*radius;
    }

    @Override
    double volume() {
        return 2*Math.PI*radius;
    }
}
class Rectangle5 extends Shape1{
    @Override
    double area() {
        return length*breadth;
    }
    @Override
    double volume() {
        return length*breadth*height;
    }
}
public class Ch11_Lec1 {
    public static void main(String[] args) {
        Circle5 c = new Circle5();
        c.setRadius(4);
        System.out.println(c.area());
        System.out.println(c.volume());

        Rectangle5 r = new Rectangle5();
        r.setLength(2);
        r.setBreadth(3);
        r.setHeight(4);
        System.out.println(r.area());
        System.out.println(r.volume());

        // abstract class & abstract methods...
    }
}
