package com.company;
class Circle1{
    public int radius;
    public double areaOfCircle(){
        return Math.PI*radius*radius;
    }
    public double volumeOfCircle(){
        return 2*Math.PI*radius;
    }
    public Circle1(int r){
        this.radius = r;
    }
}
class Cylinder1 extends Circle1{
    int height;
    public double areaOfCylinder(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
    public double volumeOfCylinder(){
        return Math.PI*radius*radius*height;
    }
    public Cylinder1(int r,int h){
        super(r);
        this.height = h;
    }
}
class Rectangle2{
    public int length;
    public int breadth;
    public int height;
    public int getLength() {
        return length;
    }
    public void setLength(int l) {
        this.length = l;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int b) {
        this.breadth = b;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public Rectangle2(int l, int b,int h){
        System.out.println("The length, breadth and height of rectangle is: "+l+","+b+" and "+h+" respectively");
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
    public double areaOfRectangle(){
        return length*breadth;
    }
    public double volumeOfRectangle(){
        return length*breadth*height;
    }
}
class Cuboid extends Rectangle2{
    public Cuboid(int l,int b,int h){
        super(l,b,h);
        System.out.println("The length, breadth and height of cuboid is: "+l+","+b+" and "+h+" respectively");
        this.length = l;
        this.breadth = b;
        this.height = h;
    }
    public double areaOfCuboid(){
        return 2*(length*breadth + breadth*height + height*length);
    }
    public int volumeOfCuboid(){
        return length*breadth*height;
    }
}
public class Ch10_Ps10 {
    public static void main(String[] args) {
        // Practice set 10

        // problem 1 & 3
        Circle1 c = new Circle1(4);
        System.out.println(c.areaOfCircle());
        System.out.println(c.volumeOfCircle());

        Cylinder1 c1 = new Cylinder1(4,5);
        System.out.println(c1.areaOfCylinder());
        System.out.println(c1.areaOfCircle());
        System.out.println(c1.volumeOfCircle());
        System.out.println(c1.volumeOfCylinder());

        // problem 2 & 4
        Rectangle2 r = new Rectangle2(4,3,6);
        double d = r.areaOfRectangle();
        double d1 = r.volumeOfRectangle();
        System.out.println(d);
        System.out.println(d1);

        /*
        Cuboid c2 = new Cuboid(7,8,9);
        System.out.println(c2.volumeOfCuboid());
        System.out.println(c2.areaOfCuboid());
        System.out.println(c2.areaOfRectangle());
        System.out.println(c2.volumeOfRectangle());
         */

    }
}
