package com.company;

public class primeNumbers {
    public static void main(String[] args) {
        primeNumbersAlgorithm.pNum(1,100);
    }
}


class primeNumbersAlgorithm {
    public static void pNum(int min ,int max) {
        int a = min;
        if(a == 1) {
            a=2;
        }
        while ( a <= max) {
            int panduan = -1;
            for(int i = 2 ; i <= Math.sqrt(a) ; i++) {
                if (a % i == 0){
                    panduan = i;
                    break;
                }
            }
            if(panduan == -1) {
                System.out.println(a);
            }
            a++;
        }

    }
}