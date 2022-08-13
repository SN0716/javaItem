package com.company;
import java.util.Scanner;
public class StartClass {
    public static void main (String[] args ) {
        PublicTest qq = new  PublicTest("李芳",0,3000,2021,1,1);
        Scanner myScanner = new Scanner(System.in);
        for (;;) {
            System.out.println("进入管理系统");
            System.out.println("1.工资管理  2.读取员工 3.退出");
            int receive = myScanner.nextInt();
            if (receive == 1) {

                System.out.println("进入工资管理");
                System.out.println("1.涨工资  2.预测工资 3.退出");
                int index = myScanner.nextInt() ;
                switch (index) {

                    case 1:
                        System.out.println("工资增长(整数)：");
                        int add = myScanner.nextInt() ;
                        PublicTest.addMoney(add);
                        System.out.println("现每月工资：" + qq.getMonthMoney() + "元");
                        break;
                    case 2 :
                        System.out.println("预测工资(月数)：");
                        int predictMonth = myScanner.nextInt() ;
                        PublicTest.estimatedMoney(predictMonth);
                        System.out.println("预测" + predictMonth +"个月后工资：" + qq.getMoneyE() + "元,现每月工资：" + qq.getMonthMoney() + "元");
                        break;
                    case 3 :
                        break;
                }

            }else if (receive == 2) {
                System.out.println("读取员工");
                System.out.println( "姓名：" + qq.getName() + "\t工资：" + qq.getMoney() +"\t月工资：" +  qq.getMonthMoney() +"\t入职时间：" +  qq.getTime());
            }else if (receive == 3) {
                System.out.println("退出管理系统");
                return;
            }
        }




    }

}