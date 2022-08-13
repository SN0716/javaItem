package com.examination;

import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        System.out.println("请输入你需要计算的阶乘数：");
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        int product = 1;
        for (int i = 1 ; i<=num ; i++) {
            product *= i;
        }
        System.out.println(num + "的阶乘为：" + product);
        System.out.println(num + "的阶乘为：" + FactorialRecursive.fr(num));
    }
}

class FactorialRecursive{
    public static int fr (int jc) {
        if (jc == 1)
            return jc;
        else
            return jc * fr(jc-1);
    }
}