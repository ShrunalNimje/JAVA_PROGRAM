package com.company;

// Problem 1
class Problem1 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<=100;i++){
            System.out.println("Good Morning!");
        }
    }
}

class Problem11 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<=100;i++){
            System.out.println("Welcome!");

            // problem 2
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Ch13_Ps13_Threads {
    public static void main(String[] args) {
        // Practice set 13
        // problem 1 & 2
//        Problem1 p = new Problem1();
//        p.start();
//        Problem11 p1 = new Problem11();
//        p1.start();

        // problem 3
//        Problem1 p = new Problem1();
//        Problem11 p1 = new Problem11();
//        p.start();
//        p1.start();
//        p.setPriority(Thread.MAX_PRIORITY);
//        p1.setPriority(Thread.MIN_PRIORITY);
//        System.out.println(p.getPriority());
//        System.out.println(p1.getPriority());

        // problem 4
        Problem1 p = new Problem1();
        Problem11 p1 = new Problem11();
//        p.start();
//        p1.start();
//        System.out.println(p.getState());
//        System.out.println(p1.getState());

        // problem 5
        p1.start();
        System.out.println(p1.getState());
        System.out.println(Thread.currentThread().getState());


    }
}
