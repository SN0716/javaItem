package com.company;
import java.time.*;
public class EmployeeTest{

    public static void main(String[] args) {
	// write your code here

        Manager boos = new Manager("liyunlong",15000,2000,9,9);
        boos.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boos;
        staff[1] = new Employee("zhangzhidong",20000,1990,3,8);
        staff[2] = new Employee("lihongzhang",31000,1976,7,5);
        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e :staff) {
            System.out.println("name:" + e.getName() + "\tsalary:" + e.getSalary() + "\thireDay:" + e.getHireDay());
        }

    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }
    //调用getName方法，返回name的值
    public String getName() {
        return name;
    }
    //调用getSalary方法，返回salary（工资）的值
    public double getSalary() {
        return salary;
    }
    //调用getHireDay方法，返回hireDay的值
    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day) {
        super(name,salary,year,month,day);
        bonus = 0;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}