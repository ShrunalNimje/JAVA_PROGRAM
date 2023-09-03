package com.company;

class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        for (int i=1; i<=100;i++){
            System.out.println("This is implemented thread 1 which runs "+i+" times...");
        }
    }
}

class MyRunnableThread1 implements Runnable {
    @Override
    public void run() {
        for (int i=1; i<=100;i++){
            System.out.println("This is implemented thread 2 which runs "+i+" times...");
        }
    }
}
public class Ch13_Lec2_Runnable {
    public static void main(String[] args) {
        MyRunnableThread mRT = new MyRunnableThread();
        Thread t = new Thread(mRT);

        MyRunnableThread1 mRT1 = new MyRunnableThread1();
        Thread t1 = new Thread(mRT1);

        t.start();
        t1.start();

    }
}
