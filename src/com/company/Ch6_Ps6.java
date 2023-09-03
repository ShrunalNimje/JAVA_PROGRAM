package com.company;

public class Ch6_Ps6 {
    public static void main(String[] args) {

        // Quick quiz+ 1
        /*
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+"\t");
            // another way to print
            //for (int i=arr.length-1;i>=0;i--) {
            // System.out.print(arr[i]+"\t");
        }
        System.out.println();
        */

        // Problem set 6

        // problem statement 1
        /*
        float [] arr1 = {12.3f,13.4f,14.5f,15.6f,17.8f};
        float sum = 0;
        for (int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        System.out.println("the sum arr is :\n"+sum);
        */

        // problem statement 2
        /*
        int [] arr2 = {1,2,3,4,5,6,7,8,9};
        int a = 4;
        boolean isPresent = false;
        for (int i=0;i< arr2.length;i++){
            if (a==arr2[i]){
                isPresent = true;
                break;
            }
        }
        if (isPresent){
            System.out.println("Integer is present in an array");
        }
        else {
            System.out.println("integer is not present in an array");
        }
        */

        // problem statement 3
        /*
        int [] arr3 = {35,45,55,65,75,85,95};
        int sum1 = 0;
        for (int element : arr3){
            sum1+=element;
        }
        System.out.println("The avg of all students is :"+sum1/arr3.length);
        */

        // problem statement 5
        /*
        int [] arr4 = {1,2,3,4,5,6,7,8,9};
        for (int i = arr4.length-1;i>=0;i--){
            System.out.print("\t"+arr4[i]);
        }
        System.out.println();
        */

        // problem statement 6
        /*
        int [] arr5 = {45,65,21,12,98,75};
        int max= Integer.MIN_VALUE;
        for (int i=0;i<arr5.length;i++){
            if (arr5[i]>max){
                max=arr5[i];
            }
        }
        System.out.println("the max value is :"+max);
         */

        // problem statement 7
        /*
        int [] arr6 = {45,65,21,12,98,75};
        int min= Integer.MAX_VALUE;
        for (int i=0;i<arr6.length;i++){
            if (arr6[i]<min){
                min=arr6[i];
            }
        }
        System.out.println("the max value is :"+min);
         */

        // Problem statement 8
        /*
        int [] arr8 = {45,98,120,150,178,250};
        boolean isSorted=true;
        for (int i=0;i<arr8.length-1;i++){
            if (arr8[i]>arr8[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted ");
        }
        else {
            System.out.println("The array is not sorted");
        }
         */

        int [] arr5 = {1,2,3,4,5,6};
        int temp;
        for (int i=0;i<arr5.length-1;i++){
            if (arr5[i]>arr5[i+1]){
                temp=arr5[i];
                arr5[i]=arr5[i+1];
                arr5[i+1]=temp;
            }
        }
        System.out.println("the sorted array is");
        System.out.println(arr5);




    }
}
