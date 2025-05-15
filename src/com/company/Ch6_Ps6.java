package com.company;

public class Ch6_Ps6 {
    public static void main(String[] args) {

        // Quick quiz+ 1
        int [] arr = {1,2,3,4,5,6,7,8,9};

        for (int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        // Problem set 6

        // problem statement 1
        float [] arr1 = {12.3f,13.4f,14.5f,15.6f,17.8f};
        float sum = 0;
        for (float e : arr1) {
            sum += e;
        }
        System.out.println("the sum arr is :\n"+sum);

        // problem statement 2
        int [] arr2 = {1,2,3,4,5,6,7,8,9};
        int a = 4;
        boolean isPresent = false;

        for (int e : arr2) {
            if (a == e) {
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

        // problem statement 3
        int [] arr3 = {35,45,55,65,75,85,95};
        int sum1 = 0;

        for (int element : arr3){
            sum1+=element;
        }
        System.out.println("The avg of all students is :"+sum1/arr3.length);

        // problem statement 4
        int [][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
        int [][] matrix2 = { {7, 8, 9}, {10, 11, 12} };
        int [][] matrixSum = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of matrix is : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }

        // problem statement 5
        int [] arr4 = {1,2,3,4,5,6,7,8,9};
        for (int i = arr4.length-1;i>=0;i--){
            System.out.print(arr4[i] + " ");
        }
        System.out.println();

        // problem statement 6
        int [] arr5 = {45,65,21,12,98,75};
        int max= Integer.MIN_VALUE;

        for (int e : arr5) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("the max value is :"+max);

        // problem statement 7

        int [] arr6 = {45,65,21,12,98,75};
        int min= Integer.MAX_VALUE;

        for (int e : arr6) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println("the max value is :"+min);

        // Problem statement 8
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

    }
}
