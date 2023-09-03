package com.company;
class Cylinder{

    // Problem Statement 1
    private int radii;
    private int height;
    public int getRadii() {
        return radii;
    }
    public void setRadii(int r) {
        this.radii = r;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int h) {
        this.height = h;
    }
    // Problem Statement 2
    public double surfaceArea(){
        return 2*Math.PI*radii*height + 2*Math.PI*radii*radii;
    }
    public double volume(){
        return Math.PI*radii*radii*height;
    }
    // Problem Statement 3
    public Cylinder(int r , int h){
        radii = r;
        height = h;
    }
}

     // Problem Statement 4
class Rectangle1{
    private int length;
    private int breadth;
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public Rectangle1(int l, int b){
        length = l;
        breadth = b;
    }
    public Rectangle1(){
        length = 4;
        breadth = 5;
    }
}

     // Problem Statement 5
/*
class Sphere{
         private int rad;
         public int getRad() {
             return rad;
         }
         public void setRad(int rad) {
             this.rad = rad;
         }
         public double surfaceArea(){
             return 4*Math.PI*rad*rad;
         }
         public double volume(){
             return 4*Math.PI*rad*rad*rad/3;
         }
     }
 */

public class Ch9_Ps9 {
    public static void main(String[] args) {

        // Problem Statement 1
        /*
        Cylinder c = new Cylinder();
        c.setRadii(4);
        System.out.println("radius of cylinder is:"+c.getRadii());
        c.setHeight(6);
        System.out.println("height of cylinder is:"+c.getHeight());
         */

        // Problem Statement 2
        /*
        Cylinder c = new Cylinder();
        c.setRadii(4);
        c.setHeight(6);
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
         */

        // problem statement 3
        /*
        Cylinder c = new Cylinder(4,6);
        System.out.println(c.getHeight());
        System.out.println(c.getRadii());
         */

        // problem statement 4
        /*
        Rectangle1  r = new Rectangle1();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
         */

        // problem statement 5
        /*
        Sphere sp = new Sphere();
        sp.setRad(4);
        System.out.println(sp.surfaceArea());
        System.out.println(sp.volume());
         */
    }
}
