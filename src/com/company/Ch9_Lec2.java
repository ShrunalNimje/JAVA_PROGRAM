package com.company;

class myNewEmployee{

    private int age;
    private String name;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int a) {
        this.salary = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    // constructor and constructor overloading
    public myNewEmployee(){
        // int age = 20;
        // String name = "Shrunal";
        // System.out.println("the age is :"+age);
        // System.out.println("the name is :"+name);
        name = "Shrunal";
        age = 20;
        salary = 3400;
    }

    public myNewEmployee(String n,int a){
        // System.out.println("The name is :"+ n);
        // System.out.println("The age is :"+ a);
        name = n;
        age = a;
    }

    public myNewEmployee(String n){
        // System.out.println("The name is :"+ n);
        // System.out.println("The age is 20");
        name = n;
        age = 43;
    }

    public myNewEmployee(int s){
        salary = s;
    }
}

public class Ch9_Lec2 {
    public static void main(String[] args) {

        myNewEmployee obj = new myNewEmployee(125000);
        System.out.println("The age is :"+ obj.getAge());
        System.out.println("The name is :"+ obj.getName());

        // myNewEmployee obj= new myNewEmployee("Shri",18);

        // Quick Quiz 2
        System.out.println("The salary is:"+obj.getSalary());

    }
}
