package com.arithmetic.study;

/**
 * @ClassName: ArithmeticDay003
 * =================================================
 * @Description: Java算法每日一题，题源来自LeetCode
 *  判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 *  示例 1:
 *
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2019/12/7 13:40
 * @Version: V1.0
 */
public class ArithmeticDay003 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int x){
        //小于0直接返回false
        if(x<0){
            return false;
        }
        //用来最后对比的数字
        int y = 0;
        //将x的值赋值给z，用来while循环
        int z = x;
        while (z!=0){
            //取余
            int a = z%10;
            //取整
            z = z/10;
            //组装值
            y = y*10+a;
        }
        return x==y?true:false;

//        String s = String.valueOf(x);
//        char[] chars = s.toCharArray();
//        char[] str = new char[chars.length];
//        for (int i = chars.length-1; i >=0; i--) {
//            str[chars.length-i-1] = chars[i];
//        }
//
//        if(String.valueOf(chars).equals(String.valueOf(str))){
//            return true;
//        }else{
//            return false;
//        }
    }
}
