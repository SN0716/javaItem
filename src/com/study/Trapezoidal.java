package com.study;

public class Trapezoidal {
    double sd;
    double xd;
    double h;
    double s;
    Trapezoidal(double sd,double xd,double h) {
        this.sd = sd;
        this.xd = xd;
        this.h = h;
        s = (sd + xd) * h / 2;
    }
    public double S () {
        return s;
    }
}
