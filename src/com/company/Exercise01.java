package com.company;
import java.util.Scanner;
public class Exercise01 {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入选择判断逻辑, 1. 使用int类型判断 2. 使用String类型判断 ");
        int p = myScanner.nextInt();
        switch (p) {
            case 1 :
                //方法一：
                System.out.println("请输入一个5位数：");
                int num = myScanner.nextInt();;
                int w = num / 10000;            //万位
                int q = num % 10000 / 1000;     //千位
                //int b = num % 1000 / 100;     //百位
                int s = num % 100 /10;          //十位
                int g = num % 10;               //个位

                if (w == g && q == s) {
                    System.out.println(num + "是回文数");
                }
                break;
            case 2 :
                //方法二：
                System.out.println("请输入一个5位数：");
                String snum = myScanner.next();
                char sw = snum.charAt(0);   //万位
                char sq = snum.charAt(1);   //千位
                char sb = snum.charAt(2);   //百位
                char ss = snum.charAt(3);   //十位
                char sg = snum.charAt(4);   //个位

                if (sw == sg && sq == ss) {
                    System.out.println(snum + "是回文数");
                }
                break;

        }

    }
}

class Exercise02 {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("您需要输入长度为多少的数组：");
        int arrlength = myScanner.nextInt();
        int[] num = new int[arrlength];
        System.out.println("请输入" + arrlength + "个数：");
        for (int i = 0 ; i < arrlength ; i++){
            num[i] = myScanner.nextInt();
        }
        for (int a : num)
            System.out.print( a + " ");

        System.out.println(""); //换行

        int temp = 0;

        int max = num[0];
        int xindex = -1;
        //找出数组中的最大值，并记录下标
        for (int i = 0 ; i < arrlength ;i++) {
            if (max < num[i]) {
                xindex = i;
                max = num[i];
            }
        }
        //将最大值与第一个数交换
        if (xindex != -1) {
            temp = num[xindex];
            num[xindex] = num[0];
            num[0] = temp;
        }

        int min = num[0];
        int nindex = -1;
        //找出数组中的最小值，并记录下标
        for (int i = 0 ; i < arrlength ;i++) {
            if (min > num[i]) {
                nindex = i;
                min = num[i];
            }
        }
        //将最小值与最后一个数交换
        if (nindex != -1) {
            temp = num[nindex];
            num[nindex] = num[arrlength - 1];
            num[arrlength - 1] = temp;
        }

        for (int a : num)
            System.out.print( a + " ");

    }
}
class Exercise03 {
    public static void main(String[] args) {
        System.out.println(countRabbit(6) * 2); //第一题方法调用并输出
        countPrimeFactors(135); //第二题方法调用
    }

    public static int countRabbit(int month) {
        //月份 1 2 3 4 5 6
        //对数 1 1 2 3 5 8
        //返回兔子对数
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return countRabbit(month-1) + countRabbit(month-2);
        }
    }

    public static void countPrimeFactors(int num) {
        int a = 2;
        System.out.print(num + " = ");
        while (a <= num) {
            if (a == num) {
                System.out.print(a);
                break;
            }else if(num % a == 0) {
                System.out.print(a + " * ");
                num /= a;
                a = 1;
            }
            a++;
        }
    }

}
class Solution01 {
public static void main(String[] args) {
    Solution a = new Solution();
    int[] arr = {3,3};
    System.out.println(a.twoSum(arr,6)[0]+" " +a.twoSum(arr,6)[1]);
}

}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] jie = new int[2];
        int temp;
        for (int i = 0;i < nums.length;i++){
            temp = target - nums[i];
            System.out.println(temp);
            for(int j = i+1 ;j < nums.length;j++){
                if(nums[j]==temp) {
                    jie[0] = i;
                    jie[1] = j;
                    break;
                }
            }
        }

        return jie;
    }
}