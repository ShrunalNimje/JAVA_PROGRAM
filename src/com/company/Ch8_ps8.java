package com.company;
// problem statement 6
class circle{
    float pi = 3.14f;
    int radi;
    public float area2(){
        return pi*radi*radi;
    }
    public float perimeter2(){
        return 2*pi*radi;
    }
}

// problem statement 5
class Tommy{
    public void hit(){
        System.out.println("i am hitting enemy...");
    }
    public void fire(){
        System.out.println("I am firing bullet continue...");
    }
}

// problem statement 4
class Rectangle{
    int l;
    int b;
    public int area1(){
        return l*b;
    }
    public int perimeter1(){
        return 2*(l+b);
    }
}

// problem statement 3
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

// problem statement 1
class Employee{
    int salary1;
    String name;
    public int getSalary(){
        return salary1;
    }
    public String getName(){
        return name;
    }
    public void setName(String a){
        name = a;
    }
}

// problem statement 2
class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}
public class Ch8_ps8 {
    public static void main(String[] args) {
        // practise set 8

        // problem statement 1
        Employee obj2 = new Employee();
        obj2.salary1 = 12;
        System.out.println(obj2.getSalary());
        obj2.setName("nimje");
        System.out.println(obj2.getName());

        // Problem statement 2
        cellPhone object = new cellPhone();
        object.ring();
        object.vibrate();

        // problem statement 3
        square Ad = new square();
        Ad.side = 5;
        System.out.println(Ad.area());
        System.out.println(Ad.perimeter());

        // Problem statement 4
        Rectangle AV = new Rectangle();
        AV.l = 24;
        AV.b = 34;
        System.out.println(AV.area1());
        System.out.println(AV.perimeter1());

        // problem statement 5
        Tommy AS = new Tommy();
        AS.fire();
        AS.hit();

        // problem statement 6
        circle ds = new circle();
        ds.radi = 4;
        System.out.println(ds.area2());
        System.out.println(ds.perimeter2());
    }
}
