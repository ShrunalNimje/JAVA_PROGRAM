package com.company;

class MyNewThr extends Thread{
    @Override
    public void run() {
        for (int i=0; i<=100;i++){
            System.out.println("Everything.....");
            try {
                Thread.sleep(2023);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class MyNewThr1 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<=100;i++){
            System.out.println("Nothing.....");
        }
    }
}
public class Ch13_Lec5_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr mNT = new MyNewThr();
        MyNewThr1 mNT1 = new MyNewThr1();
        mNT.start();
//        try {
//            mNT.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        mNT1.start();


    }
}
