package com.project;
import java.time.LocalDate;
public class administrator {
    private int adminId;
    private String adminName;
    private char adminSex;
    private int adminAge;
    private LocalDate inductionTime;
    private double wage;
    public administrator(int adminId,String adminName,char adminSex,int adminAge,int year,int month,int day,double wage) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminSex = adminSex;
        this.adminAge = adminAge;
        this.inductionTime = LocalDate.of(year,month,day);
        this.wage = wage;

    }

    public int getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public char getAdminSex() {
        return adminSex;
    }

    public int getAdminAge() {
        return adminAge;
    }

    public void setInductionTime(LocalDate inductionTime) {
        this.inductionTime = inductionTime;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
