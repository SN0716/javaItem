package com.study;
public class MiGong {
    public static void main(String[] args) {
        getMiGong.map();
    }
}
class getMiGong {
    public static void map () {
        int[][] MGmap = new int[8][7];

        //将第一行和最后一行设置成墙
        for(int i = 0; i < MGmap[0].length ;i++) {
            MGmap[0][i] = 1;
            MGmap[MGmap.length - 1][i] = 1;
        }
        for(int i = 0; i < MGmap.length ;i++) {
            MGmap[i][0] = 1;
            MGmap[i][MGmap[0].length - 1] = 1;
        }
        MGmap[3][1] = 1;
        MGmap[3][2] = 1;
        MGmap[4][3] = 1;

        for(int i = 0; i < MGmap.length ;i++) {
            for(int j = 0; j < MGmap[0].length ;j++) {
                System.out.print(MGmap[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
