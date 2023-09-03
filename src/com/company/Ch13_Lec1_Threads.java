package com.company;

class  MyThreads extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<100){
            System.out.println("Thread is running "+i+" times...");
            System.out.println("And now I am happy...");
            i++;
        }
    }
}

class  MyThreads1 extends Thread{
    @Override
    public void run(){
        int j = 0;
        while (j<100){
            System.out.println("Thread 1 is running "+j+" times...");
            System.out.println("And now I am sad...");
            j++;
        }
    }
}
public class Ch13_Lec1_Threads {
    public static void main(String[] args) {
        MyThreads mt = new MyThreads();
        MyThreads1 mt1 = new MyThreads1();
        // mt.run(); --> if we use run method instead of start method then thread will not work properly
        // mt1.run(); --> in that case the fun 1 will run first then after second ...
        mt.start();
        mt1.start();

    }
}
