import java.util.Scanner;

public class Ch2_Ps_2 {
    public static void main(String[] args) {

        // Quick Quiz 1
        int a = 5;
        int b = 4;
        System.out.println("the value of a :"+ a);
        System.out.println(a++);
        System.out.println(a);

        System.out.println("the value of b :"+ b);
        System.out.println(b--);
        System.out.println(b);
        System.out.println(++a);
        System.out.println(--b);

        // Quick quiz 2
        int y = 7;
        int x = ++y*8;
        System.out.println(x);

        char a1 = 'B';
        System.out.println(++a1);

        // practise set 2

        // problem statement 1
        float f = 7/4*9/2.f;
        System.out.println(f);

        // problem statement 2
        char grade = 'A';
        grade+=8;
        System.out.println(grade);
        grade-=8;
        System.out.println(grade);

        // problem statement 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if (num > 10) {
            System.out.println("the user entered num is greater");
        }
        else{
            System.out.println("the given num is greater");
        }

        // problem statement 4
        float v = 12;
        float u = 5;
        float a2 = 4;
        float s = 2;
        System.out.println((v*v-u*u)/(2*a2*s));

        // Problem statement 5
        int x1 = 7;
        float a3 = x1*49/x1+35/x;
        System.out.println(a3);

    }
}
