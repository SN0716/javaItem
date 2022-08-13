package com.pc;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("javaFX");
        primaryStage.getIcons().add(new Image("http://i2.hdslb.com/bfs/archive/93070e254209403d1f9c61c11df8c890d3c7b1d1.jpg@57w_57h_1c.png"));
        //primaryStage.setIconified(true);  //设置最小化
        //primaryStage.setMaximized(true);  //设置最大化
        primaryStage.setWidth(500);  //窗口宽度
        primaryStage.setHeight(500);  //窗口高度

        //primaryStage.setMaxWidth(1000);  //最大宽度
        //primaryStage.setMaxHeight(1000) ;   //最大高度

        //primaryStage.setMinHeight(300); //最小高度
        //primaryStage.setMinWidth(300);  //最小宽度

        //primaryStage.setResizable(false); //设置窗口不可调整
        primaryStage.show();
        //primaryStage.close();  //关闭  结束程序

        System.out.println("宽度："+ primaryStage.getWidth());     //获取窗口宽度
        System.out.println("高度："+ primaryStage.getHeight());    //获取窗口高度

        //监听窗口高度
        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("高度:"+newValue.doubleValue());
            }
        });

        //监听窗口宽度
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("宽度:"+newValue.doubleValue());
            }
        });

        primaryStage.setFullScreen(false);



        primaryStage.setScene(new Scene(new Group()));//窗口内容跟随
    }
}
