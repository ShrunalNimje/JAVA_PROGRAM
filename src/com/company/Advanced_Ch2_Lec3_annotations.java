package com.company;

@FunctionalInterface
interface MyNewInterface{
    public void Add(int a, int b);
}

class MyPhone extends Phone2{

    @Override
    public void On(){
        System.out.println("Switch On");
    }

    @Deprecated
    public void Subtract(int a, int b){
        System.out.println(a-b);
    }
}

public class Advanced_Ch2_Lec3_annotations {

    @Deprecated
    public static void Add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        @SuppressWarnings("Deprecation")
        MyPhone mp = new MyPhone();
        mp.On();
        mp.Subtract(4,11);
        Add(3,6);

    }
}
