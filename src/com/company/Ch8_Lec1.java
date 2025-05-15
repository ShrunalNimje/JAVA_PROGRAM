package com.company;

class Employee1 {

    int age;
    int id;
    String name;

    public int getSalary() {
        return 76000;
    }

    public void getDetailed(){
        System.out.println("The name is :"+name);
        System.out.println("The age is :"+age);
    }

}

public class Ch8_Lec1 {
    public static void main(String[] args) {

        System.out.println("Creating a custom class");
        Employee1 obj1 = new Employee1();

        // Attributes
        obj1.age = 20;
        obj1.id = 2024;
        obj1.name = "Shrunal";

        // Printing Attributes
        System.out.println("age is :"+obj1.age);
        System.out.println("Id is :"+obj1.id);
        System.out.println("name is :"+obj1.name);

        int sal = obj1.getSalary();
        System.out.println("the sal is :"+sal);

        obj1.getDetailed();

    }
}

