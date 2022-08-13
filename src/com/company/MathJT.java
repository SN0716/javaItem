package com.company;
import java.util.Scanner;
public class MathJT {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入头的个数：");
        int a = myScanner.nextInt(); //获取用户输入的一个整数，并赋给int类型的a变量,来表示头的个数
        System.out.println("请输入脚的个数：");
        int b = myScanner.nextInt(); //获取用户输入的一个整数，并赋给int类型的b变量，来表示脚的个数
        int x , y ; //声明两个int型的变量 x , y --其中-- x 表示鸡的数量  y 表示兔的数量
        if (b % 2 == 0) { //保证脚数必须是偶数
            if (b > a * 2 && b < a * 4) { //不可全是鸡 也不可全是兔 限制最大和最小脚数来限制用户输入的数据
                x = (4 * a - b ) / 2;
                y = (b - 2 * a ) / 2;
                System.out.println("答案：鸡有" + x + "只，兔有" + y +"只");
            } else {
                System.out.println("非法脚数,无法计算");
            }
        } else {
            System.out.println("脚数必须是偶数");
        }
    }
}
