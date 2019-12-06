package com.arithmetic.study;

/**
 * @ClassName: ArithmeticDay002
 * =================================================
 * @Description: Java算法每日一题，题源来自LeetCode
 *      给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 *示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 *注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，
 * 如果反转后整数溢出那么就返回 0。
 *
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @CreateDate: 2019/12/6 22:21
 * @Version: V1.0
 */
public class ArithmeticDay002 {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        int y = 1;
        if(s.charAt(0)=='-'){
            s = s.replace("-","");
            y = -1;
        }
        char[] chars = s.toCharArray();
        char[] str = new char[s.length()];
        for (int i = chars.length-1;i>=0;i--) {
            str[chars.length-i-1] = chars[i];
        }
        Long l = Long.parseLong(String.valueOf(str));
        if(Integer.MAX_VALUE<l || Integer.MIN_VALUE>l){
            return 0;
        }
        return -1*Integer.parseInt(String.valueOf(str));
    }
}
