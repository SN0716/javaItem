package com.project;
import java.util.*;
public class project {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean f = true;
        book[] books = new book[3];
        administrator[] admin = new administrator[0];
        books[0] = new book(1,"拼多多系统之六万人砍不死我","xx网友",
                2022,3,15,"一层45号");
        books[1] = new book(2,"拼多多系统之怎么也砍不下来","xx网友",
                2022,3,15,"一层46号");
        books[2] = new book(3,"拼多多系统之小数点后数位隐藏","xx网友",
                2022,3,15,"一层47号");
        while (f) {
            System.out.println("-----------图书管理系统-----------");
            System.out.println("1. 图书列表 2. 图书管理 3.管理员 4.借阅 5.退出");
            int receive = myScanner.nextInt();
            lable_library:switch (receive) {
                case 1:
                    //图书列表
                    for (int i = 0 ; i < books.length ;i++ ) {
                        System.out.println("图书id:" +books[i].getBookId() + "\t图书名称:" + books[i].getBookName() +
                                "\t图书作者:" + books[i].getAuthor() + "\t上传时间:" + books[i].getUpTime() + "\t存放位置:" + books[i].getStore());
                    }
                    break;
                case 2:
                    //图书管理
                    System.out.println("------------图书管理------------");
                    System.out.println("1.添加图书 2.删除图书 3.查找图书 4.返回");
                    int bookManagement = myScanner.nextInt();
                    switch (bookManagement) {
                        case 1:
                            //添加图书
                            System.out.println("------------添加图书------------");
                            System.out.println("请输入书籍名称：");
                            String bookName = myScanner.next();
                            System.out.println("请输入书籍作者：");
                            String author = myScanner.next();
                            System.out.println("请输入年份：");
                            int year = myScanner.nextInt();
                            System.out.println("请输入月份：");
                            int month = myScanner.nextInt();
                            System.out.println("请输入日：");
                            int day = myScanner.nextInt();
                            System.out.println("请输入存放位置：");
                            String store = myScanner.next();
                            int num = books.length;
                            book[] booksTemp = new book[num + 1];
                            int newnum = booksTemp.length;
                            for (int i = 0 ; i < num ; i++) {
                                booksTemp[i] = books[i];
                            }
                            booksTemp[newnum - 1] = new book(newnum,bookName,author,
                                    year,month,day,store);
                            books = booksTemp;
                            break;
                        case 2:
                            //删除图书
                            System.out.println("------------删除图书------------");
                            System.out.println("1.序号删除 2.名称删除 3.返回");
                            int bookDrop = myScanner.nextInt();
                            switch (bookDrop) {
                                case 1:
                                    //根据图书id删除图书
                                    System.out.println("请输入删除书籍的Id:");
                                    int id = myScanner.nextInt();
                                    books = book.dropBookId(books,id);
                                    break;
                                case 2:
                                    //根据图书名称删除图书
                                    System.out.println("请输入删除书籍的名称:");
                                    String name = myScanner.next();
                                    books = book.dropBookName(books,name);
                                    break;
                                default:
                                    //返回
                                    break lable_library;

                            }
                            //重新分配图书id
                            for (int i = 0 ; i < books.length ; i++) {
                                books[i].setBookId(i+1);
                            }
                            break;
                        case 3:
                            //查找图书
                            System.out.println("请输入查找的书籍名称:");
                            String name = myScanner.next();
                            int index = book.findBookName(books,name);
                            if (index != -1) {
                                System.out.println("图书id:" + books[index].getBookId() + "\t图书名称:" + books[index].getBookName() +
                                        "\t图书作者:" + books[index].getAuthor() + "\t上传时间:" + books[index].getUpTime() + "\t存放位置:" +
                                        books[index].getStore());
                            }
                            break;
                        default:
                            //返回
                            break lable_library;

                    }
                    break;
                case 3 :
                    //管理员
                    System.out.println("------------管理员系统------------");
                    System.out.println("1.添加管理员 2.删除管理员 3.查看管理员");
                    int adminAdd = myScanner.nextInt();
                    switch (adminAdd) {
                        case 1:
                            //添加管理员
                            System.out.println("请输入管理员名称:");
                            String name = myScanner.next();
                            System.out.println("请输入管理员性别:");
                            char sex = myScanner.next().charAt(0);
                            System.out.println("请输入管理员年龄:");
                            int age = myScanner.nextInt();
                            System.out.println("请输入管理员入职时间 格式：2021 7 3:");
                            int year = myScanner.nextInt();
                            int month = myScanner.nextInt();
                            int day = myScanner.nextInt();
                            System.out.println("请输入管理员工资（月）:");
                            double wage = myScanner.nextDouble();




                            break;
                        case 2:
                            //删除管理员
                    }
                case 4 :
                    //借阅
                default:
                    //退出
                    f = false;
                    break;
            }
        }
    }
}
