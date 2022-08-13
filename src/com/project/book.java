package com.project;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.time.*;
public class book {
    private int bookId;
    private String bookName ;
    private String author;
    private LocalDate upTime;
    private String store;

    public book (int bookId , String bookName , String author ,int year ,int month , int day , String store) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.upTime = LocalDate.of(year,month,day);
        this.store = store;
//        if(this.bookId != 0 && this.bookName != "" && this.upTime != null && this.store != "") {
//            return true;
//        }
//        return false;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
    public LocalDate getUpTime() {
        return upTime;
    }
    public String getStore() {
        return store;
    }

    public static book[] dropBookId (book[] b, int index) {
        //根据序号删除指定图书
        book[] a = new book[b.length - 1];
        int num_a = 0;
        for (int i = 0 ; i < b.length ;i++ ) {
            if (i == index - 1) {
                continue;
            }else {
                a[num_a] = b[i];
                num_a++;

            }
        }
        return a;
    }

    public static book[] dropBookName (book[] b, String bookName) {
        //根据名称删除指定图书
        book[] a = new book[b.length - 1];
        int num_a = 0;
        for (int i = 0 ; i < b.length ;i++ ) {
            if (bookName.equals(b[i].bookName)) {
                continue;
            }else {
                a[num_a] = b[i];
                num_a++;
            }
        }
        return a;
    }

    public static int findBookName (book[] b, String bookName) {
        //根据名称查找图书
        for (int i = 0 ; i < b.length ;i++ ) {
            if (bookName.equals(b[i].bookName)) {
                return i;
            }
        }
        return -1;
    }

}
