package com.company;

public class Ch7_Ps7 {

    // problem statement 1
    static void multiplicationTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println( n + " X " + i + " = " + n*i);
        }
    }

    // problem statement 2
    static void Star(int a){
        for (int i=1;i<=a;i++) {
            for (int j =1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // problem statement 3
    static int mySum(int s){
        if (s==1){
            return 1;
         }
        return s+mySum(s-1);
    }

    // problem statement 4
    static void Star1(int ab) {
        for (int i = 4; i >= ab; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // problem statement 5
    static int fb(int n) {
        if (n == 1 || n == 2) {
            return n-1;
        } else {
            return fb(n - 1) + fb(n - 2);
        }
    }

    // problem statement 6
    static int avg(int...arr){
        int sum = 0;
        for (int e:arr){
            sum+=e;
        }
        return sum/ arr.length;
    }

    // problem statement 9
    static float conversion(float c){
        return 9*c/5 + 32;
    }

    // problem statement 10
    static void mySum1(int s){
        int sum = 0;
        for (int i=0;i<=s;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // practice set 7

        // problem statement 1
        multiplicationTable(13);

        // problem statement 2
        Star(5);

        // problem statement 3
        System.out.println(mySum(43));

        // problem statement 4
        Star1(1);

        // problem statement 5
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        System.out.println(fb(10));

        // problem statement 6
       int i = avg(1,2,3,4,5);
       System.out.println(i);

        // problem statement 7 & 8
        // not understood

        // problem statement 9
       float f = conversion(44.7f);
       System.out.println(f);

        // problem statement 10
        mySum1(6);

    }
}
