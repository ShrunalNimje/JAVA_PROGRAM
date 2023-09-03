package com.company;

class MyThread2 extends Thread {
    MyThread2(String Name) {
        super(Name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hii this is Shrunal");
        }
    }
}

//class MyThread3 extends Thread{
//    MyThread3(Runnable run, String Name){
//    }
//
//    @Override
//    public void run() {
//        for (int i=0; i<=10; i++){
//            System.out.println("Hii this is Shrunal Runnable");
//        }
//    }
//}

public class Ch13_Lec3_Thread_Constructor {
    public static void main(String[] args) {

        MyThread2 mTR = new MyThread2("Shrunal Nimje");
        // MyThread3 mTR3 = new MyThread3("Shrunal Nimje");

        mTR.start();
        System.out.println("This is "+ mTR.getName());
        System.out.println("and the Id is "+ mTR.getId());
    }
}
