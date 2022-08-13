package com.company;

public class Algorithm {
    public static void main(String[] args){
        //算法003 二维数组中的查找
        int[][] arr01 = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean a = Algorithm003.findArr(12,arr01);
        System.out.println(a);

        //算法004
        String al = "Hello You're welcome";
        System.out.print("Hello You're welcome");
        Algorithm004.replace(al);
    }
}



class Algorithm003 {
    //题003 二维数组中的查找
    // 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
    // 每一列都按照从上到下递增的顺序排序。请完成一个函数，
    // 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    // 1  2   8   9
    // 2  4   9  12
    // 4  7  10  13
    // 6  8  11  15
    //
    //如果在一个二维数组中找到数字7，则返回true，如果没有找到，则返回false。

    //思路
    //就是从右上角开始遍历，假设要查找的数为A，当前遍历的数为B，B的特点是B所在行里面最大的数，
    // 也是B所在列最小的数，如果遍历的数B<A，那么B所在的行可以排除（比B都小)，如果遍历的数B>A，
    // 那么B所在的列可以排除(比B都大)。
    public static boolean findArr(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;

        int findRow = 0;
        int findCol = col - 1;


        while (findRow < row-1 && findCol >=0) {
            if (array[findRow][findCol] > target) {
                findCol--;
            } else if (array[findRow][findCol] < target){
                findRow++;
            }else {
                return true;
            }
        }
        return false;
    }
}


class Algorithm004 {
    //题004 替换空格
    //请实现一个函数，将一个字符串中的每个空格替换成“%20”。
    // 例如，当字符串为We Are Happy.则经过替换之后的字符串为 We%20Are%20Happy。

    //最暴力的方法就是从头开始对字符数组进行遍历，碰到空格，就进行替换，然后让后面的元素向后移动2位，
    // 但是这样每个空格都需要让后面的元素移动，复杂度会是O（n^2）。

    //优化的方法是先遍历一编字符串，知道字符串的空格数，然后计算得到替换后的长度=原来长度+2*空格数，
    // 然后从字符串的末尾进行遍历，每次把元素移动到计算后的数组下标的位置，并且对空格进行替换。
    public static boolean replace(String test) {
        int kongge = 0;
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == ' ') {
                kongge++;
            }
        }
        int oldText = test.length();
        int newKongGe = oldText + 2 * kongge;
        String newText = "";
        for(int i = 0; i < newKongGe ; i++) {
            newText = test.charAt(i)+"";

        }
        System.out.println("newText :" + newText);
        return false;
    }


}