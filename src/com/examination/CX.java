package com.examination;

public abstract class CX {

    CX(int a, int b) {

    }
    abstract void test();
}

class CG extends CX {
    CG(int a, int b) {
        super(a,b);
    }
    void test() {
        System.out.println("抽象重写");
    }
}
