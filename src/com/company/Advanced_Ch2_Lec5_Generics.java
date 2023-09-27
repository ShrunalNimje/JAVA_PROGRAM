package com.company;

import java.util.ArrayList;
class MyGenerics<T1,T2>{

    int value;
    protected T1 table1;
    protected T2 table2;

    MyGenerics(int v,T1 table1,T2 table2){
        System.out.println("This is my Java Generic...");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int v) {
        this.value = v;
    }

    public T1 getTable1() {
        return table1;
    }

    public void setTable1(T1 t1) {
        this.table1 = t1;
    }

    public T2 getTable2(){
        return table2;
    }

    public void setTable2(T2 t2){
        this.table2 = t2;
    }

}

public class Advanced_Ch2_Lec5_Generics {
    public static void main(String[] args) {

        // Java Generics
        ArrayList<Integer> al = new ArrayList<>();
        al.add(123);
        al.add(1223);
        al.add(1233);
        // al.add(123.5);
        //  al.add("add");
        // al.add('a');
        System.out.println(al);

//        String s = al.get(2); --> throws an error cause of we do not use type casting
//        String s1 =(String) al.get(2);
//        System.out.println(s1);
//        int i = al.get(1); --> throws an error cause of we do not use type casting
//        int i =(int) al.get(1);
//        System.out.println(i);

        // use of Generics...
        int i1 = al.get(2);
        System.out.println(i1);

        // by using Generics class
        MyGenerics<String, Integer> mg = new MyGenerics<>(234,"Generic",23456);
        mg.setValue(1234);
        mg.setTable1("abacus");
        String a = mg.getTable1();
        Integer a1 = mg.getValue();
        Integer a2 = mg.getTable2();
        System.out.println(a+"\n"+a1+"\n"+a2);

    }
}
