package com.company;
import java.util.*;
public class Test {
        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("请输入内容:");
            int clength = myScanner.next().length();
            System.out.print(clength);
//            int clength = 3;
//            String query = "测试"
            char[] combination = new char[clength];
            char charData;
            for (int i = 0 ; i < clength ;i++) {
                charData = myScanner.next().charAt(i);
                combination[i] = charData;

            }
            for (char a : combination) {
                    System.out.print(a);
            }
        }
}
class Test01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入内容:");
        String query = myScanner.next();
        int clength = query.length();
        char[] combination = new char[clength];
        char charData;
        for (int i = 0 ; i < clength ;i++) {
            charData = query.charAt(i);
            combination[i] = charData;
        }
        for (char a : combination) {
            System.out.print(a);
        }
    }
}