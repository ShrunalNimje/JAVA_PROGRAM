package com.company;

class newEmployee{

   private int age;
   private String name;
   private float radii;

   public float getAreaOfCircle(){
      return 3.14f*radii*radii;
   }

   public float getPerimeterOfCircle(){
       return 2*3.14f*radii;
   }

   public void setPerimeterOfCircle(int b){
       this.radii =b;
   }

   public void setAreaOfCircle(int a){
      this.radii = a;
   }

   public int getAge(){             // getter
       return age;
   }

   public void setAge(int a){       // setter
       this.age=a;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Ch9_Lec1 {
    public static void main(String[] args) {

        newEmployee obj = new newEmployee();

        // The statement throws an error cause of private access amplifier
        // obj.age=20;
        // obj.name="Shrunal";
        // System.out.println(obj.age);
        // System.out.println(obj.name);

        obj.setName("Shrunal");
        String i = obj.getName();
        System.out.println("The name is : "+i);

        obj.setAge(20);
        int j = obj.getAge();
        System.out.println("The age is : "+j);

        obj.setAreaOfCircle(3);
        float c = obj.getAreaOfCircle();
        System.out.println("The area of a circle is :"+c);

        // Quick Quiz 1
        obj.setPerimeterOfCircle(24);
        float d = obj.getPerimeterOfCircle();
        System.out.println("The perimeter of a circle is :"+d);

    }
}
