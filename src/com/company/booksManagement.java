package com.company;
import java.time.*;
import java.util.*;
public class booksManagement { //根据用户输入需要添加的书籍数量创建数组元素数量
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);//获取用户输入

        System.out.println("请输入添加书籍数量：");
        int number = myScanner.nextInt();//获取用户输出，需要输入的书籍数量
        Management[] book = new Management[number];//声明创建book数组
        for (int i = 0;i < number; i++) { //循环输出 书籍名称 上传网友 上传时间
            System.out.println("第" + (i + 1) + "本,请输入书籍名称：");
            String name = myScanner.next();

            System.out.println("第" + (i + 1) + "本,请输入上传网友：");
            String friend = myScanner.next();

            System.out.println("第" + (i + 1) + "本,请输入上传时间(年)：");
            int timeYear = myScanner.nextInt();

            System.out.println("第" + (i + 1) + "本,请输入上传时间(月)：");
            int timeMonth = myScanner.nextInt();

            System.out.println("第" + (i + 1) + "本,请输入上传时间(日)：");
            int timeDay = myScanner.nextInt();

            book[i] = new Management(name,friend,timeYear,timeMonth,timeDay); //将用户输入信息保存到book数组中
        }
        System.out.println("书籍编号" +"\t书籍名称" + "\t上传网友"  + "\t上传时间");
        for (Management e : book) {
            e.setId();//为书籍设置一个书籍id
            System.out.println(e.getId() +"\t《" + e.getBookName() + "》\t" + e.getUploaderFriend() + "\t" + e.getCollectionTime());//输出
        }
    }
}

class BooksManagementOptimize {//使用数组扩充添加数组元素
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);//获取用户输入

        Management[] book = new Management[1];//声明创建book数组
        int i = 0;
        do {
            System.out.println("第" + (i + 1) + "本,请输入书籍名称：");
            String name = myScanner.next();

            System.out.println("第" + (i + 1) + "本,请输入上传网友：");
            String friend = myScanner.next();

            System.out.println("第" + (i + 1) + "本,请输入上传时间(年)：");
            int timeYear = myScanner.nextInt();

            System.out.println("第" + (i + 1) + "本,请输入上传时间(月)：");
            int timeMonth = myScanner.nextInt();

            System.out.println("第" + (i + 1) + "本,请输入上传时间(日)：");
            int timeDay = myScanner.nextInt();

            book[i] = new Management(name,friend,timeYear,timeMonth,timeDay); //将用户输入信息保存到book数组中

            i++;

            book[book.length - 1].setId();

            System.out.println("书籍编号" +"\t书籍名称" + "\t上传网友"  + "\t上传时间");

            for (Management e : book) {
                System.out.println(e.getId() +"\t《" + e.getBookName() + "》\t" + e.getUploaderFriend() + "\t" + e.getCollectionTime());//输出
            }


            System.out.println("是否继续添加？ Y/N");
            String receive = myScanner.next();

            if ("Y".equalsIgnoreCase(receive)){
                Management[] arrNew = new Management[book.length + 1];
                for (int j = 0;j < book.length;j++) {
                    arrNew[j] = book[j];
                }
                book = arrNew;
            }else {
                break;
            }
        }while(true);
    }
}

class Management {
    private static int nextId = 1;
    private int id;
    private String bookName;
    private String uploaderFriend;
    private LocalDate collectionTime;

    public Management(String b, String u, int year, int month, int day){
        id = 0;
        bookName = b;
        uploaderFriend = u;
        collectionTime = LocalDate.of(year,month,day);
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getUploaderFriend() {
        return uploaderFriend;
    }

    public LocalDate getCollectionTime() {
        return collectionTime;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }
}
