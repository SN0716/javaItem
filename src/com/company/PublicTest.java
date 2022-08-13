package com.company;
import java.time.*;
public class PublicTest {
    private String name;
    private static int money;
    private static int monthMoney;
    private LocalDate time;
    private static int moneyE;

    public PublicTest (String n,int m,int mm,int year,int month,int day) {
        name = n;
        money = m;
        monthMoney = mm;
        time = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getMonthMoney() {
        return monthMoney;
    }

    public LocalDate getTime() {
        return time;
    }

    public static void addMoney(int add) {
        monthMoney += add;
    }

    public static void estimatedMoney(int monthNum) {
        moneyE = monthMoney * monthNum;
    }
    public int getMoneyE() {
        return moneyE;
    }
    public static void calculateMoney() {
        money += monthMoney;
    }


    public static void main(String[] args) {
        PublicTest qq = new  PublicTest("李芳",0,5600,2021,1,1);
        System.out.println( "姓名：" + qq.getName() + "\t工资：" + qq.getMoney() +"\t月工资：" +  qq.getMonthMoney() +"\t入职时间：" +  qq.getTime());
        addMoney(2000);
        calculateMoney();
        System.out.println( "姓名：" + qq.getName() + "\t工资：" + qq.getMoney() +"\t月工资：" +  qq.getMonthMoney() +"\t入职时间：" +  qq.getTime());

    }
}
