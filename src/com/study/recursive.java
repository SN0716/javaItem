package com.study;

public class recursive {
    public static void main(String[] args) {
        int num = 15;

        //阶乘
//        int a = factorial.factorial(num);
//        System.out.println(num + "的阶乘为：" + a);
        //斐波那契数
//        int b = fibonacciNumber.fibonacciNumber(num);
//        System.out.println("第" + num + "个斐波那契数是："+ b);
        //猴子吃桃子
            int c = monkey.peach(1);//第一天有多少个桃子 ： 1534个
            System.out.println("c一共有："+ c + "个桃子");
    }
}

class factorial {
    //递归算法：阶乘 (factorial)
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }else {
            n *= factorial(n-1);
        }
        return n;
    }
}

class fibonacciNumber {
    public static int fibonacciNumber(int f) {
        //递归算法：斐波那契数 （Fibonacci number）
        if (f == 1 || f == 2) {
            return 1;
        } else {
            return fibonacciNumber(f-1) + fibonacciNumber(f-2);
        }
    }
}
class monkey {
    /*猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！ 以后每天猴子都吃其中的一半，然后再多吃一个。
    当到第 10 天时， 想再吃时（即还没吃），发现只有 1 个桃子了。问题：最初共多少个桃子？

    思路分析 逆推
    1. day = 10 时 有 1 个桃子
    2. day = 9 时 有 (day10 + 1) * 2 = 4
    3. day = 8 时 有 (day9 + 1) * 2 = 10
    4. 规律就是 前一天的桃子 = (后一天的桃子 + 1) * 2
    //就是我们的能力
    5. 递归 */
    public static int peach (int day) {
        int peach = 0;
        if(day == 10) {
            peach = 1;
        }else if (day >= 1 && day <= 9) {
            peach = (peach(day + 1) + 1) * 2;
        }else{
            peach = -1;
            System.out.println("请输入1-10");
        }
        return peach;
    }
}