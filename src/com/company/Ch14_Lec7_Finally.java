package com.company;

public class Ch14_Lec7_Finally {
    public static int problem(){
        try {
            int a = 56;
            int b = 0;
            int c = a/b;
            return c ;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is Finally 1 statement..");
        }
        return 0;

    }
    public static void main(String[] args) {
//        int a = 56;
//        int b = 0;
//        try {
//            System.out.println(a/b);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("This is Finally statement...");
//        }
        System.out.println(problem());

        int j = 7;
        int i = 4;
        while (true){
            try {
                System.out.println(i/j);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("This is an Finally statement when value of j is :" + j);
            }
            j--;
        }

        //        Finally block contains the code which is always executed whether the exception is handled or not.
        //        It is used to exception is handled or not.
    }
}
