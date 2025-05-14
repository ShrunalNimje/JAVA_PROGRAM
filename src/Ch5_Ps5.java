public class Ch5_Ps5 {
    public static void main(String[] args) {

        // Quick Quiz 1
        int n = 100;
        while(n<=200){
            System.out.print(n+"\t");
            n++;
        }

        // Quick quiz 2
        int n1 = 1;
        do {
            System.out.print(n1+"\t");
            n1++;
        }while(n1<=100);

        // Quick Quiz 3
        for (int i = 0; i<=10; i++){
            System.out.print(2*i+1 + "\t");
        }

        // Quick Quiz 4
        int n2 = 25;
        do {
            System.out.print(n2+"\t");
            n2--;
        }while (n2>=1);

        // practise set 5

        // problem statement 1
        System.out.println();
        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // problem statement 2
        int n3 = 10;
        int sum = 0;

        while (n3>=1){
            sum+=2*n3;
            n3--;
        }
        System.out.println(sum);

        // problem statement 3
        int num = 6;
        for (int i=1;i<=10;i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }

         // problem statement 4
        int num1 = 10;
        for (int i=10;i>=1;i--){
            System.out.println(num1 + " X " + i + " = " + num1*i);
        }

        // problem statement 5
        int n5 = 4;
        int fact=1;
        for(int i=1;i<=n5;i++){
            fact*=i;
        }
        System.out.println("the factorial of given num is :"+fact);

        // problem statement 6
        int n6 = 4;
        int fact1=1;
        int i=1;
        while (i<=n6){
            fact1*=i;
            i++;
        }
        System.out.println("the factorial of given num is :"+fact1);

        //problem statement 7
        int i2 = 4;
        while (i2>=1){
            int j = 1;
            while (j<=i2){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i2--;
        }

        // problem statement 9
        int n4 = 8;
       int sum1=0;

        for (int i4=1;i4<=10;i4++) {
            sum1+=n4*i;
        }
        System.out.println(sum1);

        // problem statement 11
        int n7= 6;
        int sum2=0;

        for (int i1=0;i1<=n7;i1++){
            sum2+=2*i1;
        }
        System.out.println("The sum of given number is :"+sum2);

    }
}
