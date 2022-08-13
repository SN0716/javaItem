package com.examination;

public class JCTest {
    public static void main(String[] args) {
        JiCheng j = new JiCheng();
        j.show();
        j.b();
        j.id=1;
        j.name="cs";
        System.out.println("id:"+j.getId() +" name:"+j.getName());
        System.out.println("-----------------------------");
        JiCheng j1 = new JiCheng(1,"测试");
        j1.show();
        j1.b();
        System.out.println("id:"+j1.getId() +" name:"+j1.getName());
        System.out.println("-----------------------------");
        B b=new B();
        b.show();
        b .b();
        b.id=1;
        b.name="马化腾";
        b.qq="100001";
        System.out.println("id:"+b.getId() +" name:"+b.getName()+" qq:"+b.getQq());
        System.out.println("-----------------------------");
        B b1 = new B(1,"测试","000212");
        b1.show();
        b1.b();
        System.out.println("id:"+b1 .getId() +" name:"+b1 .getName()+" qq:"+b1.getQq());
        System.out.println("-----------------------------");
        CG c = new CG(1,2);
        c.test();
    }
}
