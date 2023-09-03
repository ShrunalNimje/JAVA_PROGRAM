package com.company;

class Thread23 extends Thread {
    Thread23(String Name){
        super(Name);
    }

    @Override
    public void run() {
        for (int i=0; i<=20;i++){
            System.out.println(getName());
        }
    }
}
public class Ch13_Lec4_Thread_Priority {
    public static void main(String[] args) {

        Thread23 t1 = new Thread23("Shrunal Nimje");
        Thread23 t2 = new Thread23("Shrunal Hai Na");
        Thread23 t3 = new Thread23("Shrunal Ki Jay Ho");
        Thread23 t4 = new Thread23("Shrunal Gym Gya");
        Thread23 t5 = new Thread23("Shrunal Nothing");
        Thread23 t6 = new Thread23("Shrunal Everything");
        t6.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
