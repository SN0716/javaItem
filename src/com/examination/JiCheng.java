package com.examination;

public class JiCheng {
    int id;
    String name;
    JiCheng(int id,String name){
         this.id=id;
         this.name=name;
    }
    JiCheng(){

    }
    void show (){
        System.out.println("你的id为："+ id + "名字为：" + name);
    }

    int getId() {
        return id;
    }
    String getName() {
        return name;
    }

    private void a () {
        System.out.println("这个方法是私有的");
    }
    void b() {
        System.out.println("子类重写这个方法");
    }
}

class B extends JiCheng {
    String qq;
    B() {
        id=0;
        name="NULL";
        qq="";
    }
    B(int id,String name,String qq) {
        super(id,name);
        this.qq=qq;
    }

    @Override
    void b() {
        System.out.println("子类重写成功");
    }
    void show () {
        System.out.println("你的id为："+ id + "名字为：" + name+" qq:" + qq);
    }
    String getQq() {
        return qq;
    }
}