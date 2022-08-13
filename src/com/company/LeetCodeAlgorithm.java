package com.company;

public class LeetCodeAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9,3};
        int[] a;
        a = LeetCodeAlgorithm1.twoNumAdd(arr,3);
        for (int b : a) {
            System.out.println("下标为：" +b);
        }
    }
}


class LeetCodeAlgorithm1 {
    //第1题-两数之和
    //题目详情：https://leetcode-cn.com/problems/two-sum/

    // 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    //示例:
    //给定 nums = [2, 7, 11, 15], target = 9
    //因为 nums[0] + nums[1] = 2 + 7 = 9
    //所以返回 [0, 1]

    //思路
    //其实也没啥好说的，就是对数组进行遍历，遍历时将target-nums[i]得到需要的值needValue，判断hashMap中是否存在这个needValue，
    // 存在就直接返回了，不存在就将nums[i]添加到hashMap，继续遍历。
    public static int[] twoNumAdd(int[] nums , int target) {
        int storage[] = new int[2];
        storage[0] = -1;
        storage[1] = -1;
        //方法1：
//        for(int i = 0; i < nums.length ; i++) {
//            for (int j = nums.length - 1 ; j >= 0 ; j--) {
//                if (i == j) {
//                    continue;
//                }else if(nums[i] + nums[j] == target) {
//                    storage [0] = i;
//                    storage [1] = j;
//                }
//            }
//        }
        //方法2：
        int results ;
        for (int i = 0; i < nums.length ; i++) {
            results = target - nums[i];
            for (int j = i + 1 ; j < nums.length ; j++) {
                if (nums[j] == results) {
                    storage [0] = i;
                    storage [1] = j;
                }
            }
        }

        return storage;
    }
}
