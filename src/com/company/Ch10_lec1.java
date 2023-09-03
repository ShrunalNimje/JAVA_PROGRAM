package com.company;
class SuperClass{
    public int age;
    public int getAge() {
        return age;
    }
    public void ageOfClass(int a){
        // here, there is not any requirement to make setter because by using methods we assign 'a' in the int age
        System.out.print("Age of class is: ");
        age = a;
    }
}
class SubClass extends SuperClass{
    int salary;
    public int getSalary() {
        return salary;
    }
    public void salaryOfClass(int s){
        // here, there is not any requirement to make setter because by using methods we assign s in the int salary
        System.out.print("Salary of class is: ");
        salary = s;
    }
}

// Quick Quiz 1
class Animal{
    String color;

    public String getColor() {
        return color;
    }
    public void colorOfAnimal(String c){
        System.out.print("color of animal is: ");
        color = c;
    }
}
class Dog extends Animal{
    int age;
    public int getAge() {
        return age;
    }
    public void ageOfDog(int a){
        System.out.print("age of dog is: ");
        age = a;
    }
}
public class Ch10_lec1 {
    public static void main(String[] args) {

        // using superclass...
        SuperClass sp = new SuperClass();
        sp.ageOfClass(20);
        System.out.println(sp.getAge());

        // inheritance in subclass using superclass...
        SubClass sc = new SubClass();
        sc.salaryOfClass(150000);
        System.out.println(sc.getSalary());
        sc.ageOfClass(49);
        System.out.println(sc.getAge());

        // Quick Quiz 1
        // using superclass...
        Animal a = new Animal();
        a.colorOfAnimal("Red");
        System.out.println(a.getColor());

        // inheritance in subclass using superclass...
        Dog d = new Dog();
        d.ageOfDog(6);
        System.out.println(d.getAge());
        d.colorOfAnimal("Red");
        System.out.println(d.getColor());

    }
}
