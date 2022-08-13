package com.company;
import java.util.*;
import java.lang.String;
public class java01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int receive = myScanner.nextInt();
        switch (receive) {
            case 1:
                System.out.println("你好啊");
                break;
            case 2:
                System.out.println("哈哈哈");
                break;
            case 3:
                System.out.println("你是狗吗？");
                break;
            case 4:
                System.out.println("找事是吧");
                break;
        }
    }
}

class java02 {
    public static void main(String[] args) {
        System.out.println(~60);
        //推导过程
        //1. 先得到 60的补码 =>
        //	 60的原码: 00000000 00000000 00000000 00111100
        //
        //2.
        //	 60的补码: 00000000 00000000 00000000 00111100
        //
        //3.按位~
        //	 00000000 00000000 00000000 00111100
        //	 11111111 11111111 11111111 11000011~ 运算后的补码 负数
        //
        // 负数的反码=它的原码符号位不变，其它位取反(0->1,1->0)
        // 负数的补码=它的反码+1，负数的反码 = 负数的补码 - 1
        //
        // 4.
        // 运算后反码: 11111111 11111111 11111111 11000010
        // 运算后原码: 10000000 00000000 00000000 00111101
        //
        // 运算后的原码是 10000000 00000000 00000000 00111101 负数
        // 结果就是 -61
    }
}

//数组扩容原理
class addArray01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arrNew = new int[arr.length + 1];//创建一个新的数组，比arr数组元素多一个
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];//遍历数组，将arr数组的元素全部放到arrNew数组中
        }
        arrNew[arrNew.length - 1] = 4;//在arrNew数组添加元素
        arr = arrNew;//将arr数组 指向 arNew数组
        System.out.println("=====arr数组======");
        for (int a : arr) {
            System.out.print(a + "\t");
        }
    }
}

class addArray02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        do {
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入添加数据：");
            int arrayAdd = myScanner.nextInt();
            arrNew[arrNew.length - 1] = arrayAdd;
            arr = arrNew;
            System.out.println("=====arr数组======");
            for (int a : arr) {
                System.out.print(a + "\t");
            }
            System.out.println("\n是否继续添加：(Y 或 N)");
            String key = myScanner.next();

            if ("Y".equalsIgnoreCase(key)) {
                System.out.println("=====继续运行======");
            }else {
                System.out.println("你输入的不是Y，智能帮你退出");
                break;
            }
        }while(true);
    }
}

class ArrayReduce {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        do {
            int[] arrNew = new int[arr.length - 1];
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
            System.out.println("=====arr数组======");
            for (int a : arr) {
                System.out.print(a + "\t");
            }
            if (arr.length <= 1) {
                System.out.println("\narr数组元素仅剩一个，无法在删除");
                break;
            }
            System.out.println("\n是否继续添加：(Y 或 N)");
            String key = myScanner.next();

            if ("Y".equalsIgnoreCase(key)) {
                System.out.println("-------继续运行------");
            }else {
                System.out.println("你输入的不是Y，智能帮你退出");
                break;
            }
        }while(true);
    }
}


class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{24,69,80,57,13};
        // 第 1 轮排序: 目标把最大数放在最后
        // 第 1 次比较[24,69,80,57,13]
        // 第 2 次比较[24,69,80,57,13]
        // 第 3 次比较[24,69,57,80,13]
        // 第 4 次比较[24,69,57,13,80]

        // 第 2 轮排序: 目标把第二大数放在倒数第二位置
        // 第 1 次比较[24,69,57,13,80]
        // 第 2 次比较[24,57,69,13,80]
        // 第 3 次比较[24,57,13,69,80]

        // 第 3 轮排序: 目标把第 3 大数放在倒数第 3 位置
        // 第 1 次比较[24,57,13,69,80]
        // 第 2 次比较[24,13,57,69,80]

        // 第 4 轮排序: 目标把第 4 大数放在倒数第 4 位置
        // 第 1 次比较[13,24,57,69,80]
        int temp;
        for (int j = 1; j <= arr.length - 1 ; j++) {
            System.out.println("第" + j + "轮排序");
            for (int i = 0; i < (arr.length - j); i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                System.out.println("======第" + (i + 1) + "次比较后的arr数组======");
                for (int a : arr) {

                    System.out.print(a + "\t");
                }
                System.out.print("\n");
            }
        }
    }
}

class ArrayFind {
    public static void main(String[] args) {
        System.out.println("请输入你查找的对象：");
        Scanner myScanner = new Scanner(System.in);
        String[] role = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        String roleFind = myScanner.next();
        int index = -1; //索引 初始值为 -1  用于判断未找到查找对象时能顺利返回提示信息
        for (int i = 0; i < role.length; i++) {
            index = -1; // 防止循环查找时（代码非循环查找）出现不必要错误
            if (roleFind.equals(role[i])) {
                index = i; //找到查找对象 将下标值 赋给 索引 index
                System.out.println("找到了\"" + roleFind + "\"，下标为：" + i);
                break;
            }
        }
        if (index == -1) { //如果 索引 index = -1 则 说明未找到查找对象
            System.out.println("您要查找的对象\"" + roleFind + "\"可能不在数组内哦");
        }

    }
}

class ArrRandom {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int num;
        for (int j = 0 ; j < arr.length ; j++) {
            int index = -1; //索引 初始值为 -1  用于判断未找到查找对象时能顺利返回提示信息
            do {
                num = (int)(Math.random() * 49) + 1;
                for (int i = 0; i < arr.length; i++) {
                    index = -1; // 防止循环查找时（代码非循环查找）出现不必要错误
                    if (num == arr[i]) {
                        index = i; //找到查找对象 将下标值 赋给 索引 index
                        System.out.println("找到了\"" + num + "\"，下标为：" + i);
                        break;
                    }
                }
                if (index == -1) { //如果 索引 index = -1 则 说明未找到查找对象
                    arr[j] = num;
                    System.out.println("您要查找的对象\"" + num + "\"可能不在数组内哦");
                }
            }while (index != -1);
        }
        for (int a : arr) {
            System.out.print(a + "\t");
        }

    }
}

class twoDimensionalArray {
    public static void main(String[] args) {
//        请用二维数组输出如下图形
//        0 0 0 0 0 0
//        0 0 1 0 0 0
//        0 2 0 3 0 0
//        0 0 0 0 0 0
        int[][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0}};

        for (int[] e : arr) {
            for (int a : e) {
                System.out.print(a + "\t");
            }
            System.out.print("\n");
        }

    }
}

class twoDimensionalArray01 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[1][1] = 7;
        for (int[] e : arr) {
            for (int a : e) {
                System.out.print(a + "\t");
            }
            System.out.print("\n");
        }

    }
}



class twoDimensionalArray02 {
    public static void main(String[] args) {
        /*看一个需求：
        动态创建下面二维数组，并输出
        i = 0: 1
        i = 1: 2 2
        i = 2: 3 3 3

        一个有三个一维数组, 每个一维数组的元素是不一样的
        */
        int num = 10;

        int[][] arr =new int[num][];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0 ; j < arr[i].length ; j++) {
                arr[i][j] = i + 1;
            }
        }
        int q = 0 ;
        for (int[] a : arr) {
            System.out.print("i = " + q + " : ");
            for (int b : a) {
                System.out.print(b + "\t");
            }
            System.out.print("\n");
            q++;
        }
    }
}

class YangHuiSan {
    public static void main(String[] args) {
//        使用二维数组打印一个 10 行杨辉三角
//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//        1 5 10 10 5 1
//        规律
//        1. 第一行有 1 个元素, 第 n 行有 n 个元素
//        2. 每一行的第一个元素和最后一个元素都是 1
//        3. 从第三行开始, 对于非第一个元素和最后一个元素的元素的值. arr\[i][j]
//        arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; //必须找到这个规律

        int[][] yangHui = new int[10][];
        for (int i = 0 ; i < yangHui.length ; i++) {//遍历 yangHui 的每个元素
            //给每个一维数组(行) 开空间
            yangHui[i] = new int[i + 1];
            //给每个一维数组(行) 赋值
            for (int j = 0 ; j < yangHui[i].length ; j++) {
                //每一行的第一个元素和最后一个元素都是 1
                if (j == 0 || j == yangHui[i].length - 1 ) {
                    yangHui[i][j] = 1;
                }else {
                    yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
                }
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
//object 对象
class Object01 {

    //编写一个main方法
    public static void main(String[] args) {

		/*
		张老太养了两只猫猫:一只名字叫小白,今年3岁,白色。
		还有一只叫小花,今年100岁,花色。请编写一个程序，当用户输入小猫的名字时，
		就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，
		则显示 张 老太没有这只猫猫。
		 */
        //单独变量来解决 => 不利于数据的管理(你把一只猫的信息拆解)
        //第1只猫信息

        // String cat1Name = "小白";
        // int cat1Age = 3;
        // String cat1Color = "白色";

        // //第2只猫信息
        // String cat2Name = "小花";
        // int cat2Age = 100;
        // String cat2Color = "花色";

        //数组 ===>(1)数据类型体现不出来(2) 只能通过[下标]获取信息，造成变量名字和内容
        //         的对应关系不明确(3) 不能体现猫的行为
        //第1只猫信息

        // String[] cat1 = {"小白", "3", "白色"};
        // String[] cat2 = {"小花", "100", "花色"};


        //使用OOP面向对象解决
        //实例化一只猫[创建一只猫对象]
        //老韩解读
        //1. new Cat() 创建一只猫(猫对象)
        //2. Cat cat1 = new Cat(); 把创建的猫赋给 cat1
        //3. cat1 就是一个对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        //创建了第二只猫，并赋给 cat2
        //cat2 也是一个对象(猫对象)
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";

        //怎么访问对象的属性呢
        System.out.println("第1只猫信息" + cat1.name
                + " " + cat1.age + " " + cat1.color);

        System.out.println("第2只猫信息" + cat2.name
                + " " + cat2.age + " " + cat2.color);
    }
}


//使用面向对象的方式来解决养猫问题
//
//定义一个猫类 Cat -> 自定义的数据类型
class Cat {
    //属性/成员变量
    String name; //名字
    int age; //年龄
    String color; //颜色
    //double weight; //体重

    //行为

}
class ObjectExercise01 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "汤姆";
        c.age = 18;
        c.color = "蓝色";
        cloning co = new cloning();
        Cat c2 = co.cloningObject(c);
        co.Modify(c);
        System.out.println("c.name = " + c.name + " c.age = " + c.age);
        System.out.println("c2.name = " + c2.name + " c2.age = " + c2.age);

        System.out.println(c == c2);
    }
}
class cloning {
    public Cat cloningObject (Cat c) {

        //克隆对象
        Cat c2 = new Cat();
        c2.name = c.name;
        c2.age = c.age;
        c2.color= c.color;
        return c2;
    }
    public void Modify(Cat c) {
        //修改Cat对象中 name属性的值[String类型(指向方法区常量池中的地址)]
        c.name = "杰瑞";
    }
}
class recursiveTest {
    public static void main(String[] args ) {
        int a = recursive.fibonacci(7);
        if (a != -1) {
            System.out.println(a);
        }else {
            System.out.println("传入数值错误，必须大于等于1");
        }

    }
}

class recursive {
    public static int fibonacci(int n) {
        if ( n >= 1 ) {
            if ( n == 1 || n == 2) {
                return 1;
            }else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else  {
            System.out.println("数据错误");
            return -1;
        }
    }

}

class animal {
     String varieties;
     int age;
     char sex;

    public void animal(String v,int a,char s) {
        varieties = v;
        age = a;
        sex = s;
    }


}

class cat extends animal{
    public void cat(String v,int a,char s) {
        System.out.println(varieties + age + sex);

    }
}

class test00 {
    public static void main(String[] args) {
        animal a = new animal();
        a.animal("卡劳",2,'公');
        cat c = new cat();
        c.cat("卡劳",3,'公');

    }
}


