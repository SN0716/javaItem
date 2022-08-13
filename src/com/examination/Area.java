package com.examination;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        boolean flag = true;
        while(flag) {
            System.out.println("请输入指定计算序号 1.长方形面积 2.圆的面积 3.梯形的面积 4.退出");
            Scanner myScanner = new Scanner(System.in);
            switch (myScanner.nextInt()) {
                case 1:
                    double c,k,g,s;
                    System.out.println("请输入长");
                    c = myScanner.nextDouble();
                    System.out.println("请输入宽");
                    k = myScanner.nextDouble();
                    System.out.println("请输入高");
                    g = myScanner.nextDouble();
                    s=c*k*g;
                    System.out.println("长方形的面积为：" + s);
                    break;
                case 2:
                    final double PI = 3.14;
                    double r;
                    System.out.println("请输入半径");
                    r = myScanner.nextDouble();
                    s=PI*r*r;
                    System.out.println("长方形的面积为：" + s);
                    break;
                case 3:
                    double sd,xd,h,m;
                    System.out.println("请输入上底");
                    sd = myScanner.nextDouble();
                    System.out.println("请输入下底");
                    xd = myScanner.nextDouble();
                    System.out.println("请输入高");
                    h = myScanner.nextDouble();
                    m=(sd+xd)*h/2;
                    System.out.println("长方形的面积为：" + m);
                    break;
                default :
                    flag = false;
                    break;
            }
        }
    }
}
