package com.arithmetic.study;

/**
 * @ClassName: ArithmeticDay001
 * =================================================
 * @Description: Java算法每日一题，题源来自LeetCode
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 给定 nums = {12,33,22,55,69,56,10}, target = 78
 * 因为 nums[2] + nums[5] = 22+ 56 = 78
 * 所以返回 [2, 5]
 *
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @CreateDate: 2019/12/5 22:59
 * @Version: V1.0
 */
public class ArithmeticDay001 {


    public static void main(String[] args) {
        int[] nums = {12,33,22,55,69,56,10};
        System.out.println(geTarget(nums,78).toString());
    }

    public static int[] geTarget(int[] nums,int target){
        int[] targets = null;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    targets = new int[]{i, j};
                }
            }
        }
        return targets;
    }
}
