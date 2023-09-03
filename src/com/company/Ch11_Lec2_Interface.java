package com.company;
// interfaces and implementations of interfaces by creating class...

interface Cycle{
    float f = 4.5f;
    void Brake(int a);
    void SpeedUp(int b);
}

interface BiCycle{
    float f1 = 6.8f;
    void ApplyBrake(int decrement);
    void BlowHorn();
}

class Avon implements Cycle, BiCycle{
    @Override
    public void Brake(int a) {
        a--;
        System.out.println("The brake has been applied by "+a);
    }
    @Override
    public void SpeedUp(int b) {
        b++;
        System.out.println("The speed has been increased by "+b);
    }
    @Override
    public void ApplyBrake(int decrement){
        decrement--;
        System.out.println("The brake has been applied and speed is reduced by "+decrement);
    }
    @Override
    public void BlowHorn(){
        System.out.println("Po Po Pee Pee \nPo Po Pee Pee");
    }
}

public class Ch11_Lec2_Interface {
    public static void main(String[] args) {

        Avon a = new Avon();
        a.Brake(10);
        a.SpeedUp(6);
        // we can create properties in interfaces
        System.out.println(a.f);
        System.out.println(a.f1);
        // a.f = 5.6f; --> throws an error since the properties are already defined
        a.ApplyBrake(5);
        a.BlowHorn();

        // interfaces and implementations of interfaces by creating class...
    }
}
