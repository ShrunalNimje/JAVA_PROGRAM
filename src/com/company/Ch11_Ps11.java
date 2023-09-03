package com.company;
// Problem 1 & 2
abstract class Pen{
    public abstract void write();
    public abstract void refill();
}
class FountainPen extends Pen{
    public void changeNib(){
        System.out.println("Changing the nib...");
    }
    public void refill(){
        System.out.println("Refilling the pen...");
    }
    public void write(){
        System.out.println("writing by pen...");
    }
}
// Problem 3 & 5
class Monkey{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    void jump(){
        System.out.println("Jump");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
// problem 4
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone {
    void On(){
        System.out.println("On...");
    }
    void ring(){
        System.out.println("Ringing...");
    }
    void lift(){
        System.out.println("lifting...");
    }
    void disconnect(){
        System.out.println("Disconnecting...");
    }
}
interface TVRemote{
    void On();
    void Off();
}
interface SmartTVRemote extends TVRemote{
    void changeChannel();
    void playMovie();
}
class TV implements SmartTVRemote{
    public void changeChannel(){
        System.out.println("Changing the channel...");
    }
    public void playMovie(){
        System.out.println("playing the movies...");
    }
    @Override
    public void On(){
        System.out.println("On");
    }
    public void Off(){
        System.out.println("Off");
    }
}
public class Ch11_Ps11 {
    public static void main(String[] args) {

        // practice set 11
        // Problem 1 & 2
        FountainPen fp = new FountainPen();
        fp.changeNib();
        fp.refill();
        fp.write();

        // Problem 3
        /*
        Monkey m = new Monkey();
        m.bite();
        m.jump();
         */
        Human h = new Human();
        h.sleep();
        h.eat();
        h.bite();
        h.jump();

        // Problem 4
        Telephone tp = new SmartTelephone();
        tp.ring();
        tp.disconnect();
        tp.lift();

        // problem 5
        Monkey m = new Human();
        m.jump();
        m.bite();
        BasicAnimal ba = new Human();
        ba.eat();
        ba.sleep();

        // Problem 6 & 7
        TV n = new TV();
        n.Off();
        n.On();
        n.changeChannel();
        n.playMovie();

    }
}
