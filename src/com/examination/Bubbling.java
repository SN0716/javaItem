package com.examination;

import java.util.Scanner;

public class Bubbling {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入你需要排列的数的个数：");
        int num = myScanner.nextInt();
        System.out.print("请输入"+num+"个需要排列的数：");
        int[] arr = new int[num];
        for (int i = 0 ; i < num ; i++) {
            arr[i] = myScanner.nextInt();
        }

        for (int i =0;i< arr.length;i++) {
            for (int j = i; j< arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
