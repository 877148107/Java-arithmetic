package com.arithmetic.study;

import java.util.HashMap;

/**
 * @ClassName: ArithmeticDay004
 * =================================================
 * @Description: Java算法每日一题，题源来自LeetCode
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。
 *      12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
 * 所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 * 输入: 'III'  相等都相加 3
 * 输出: 3
 *
 *  示例 2:
 * 输入: 'IV' 左边小于右边  右边减左边
 * 输出: 4
 *
 *  示例 3:
 * 输入: 'IX' 左边小于右边  右边减左边
 * 输出: 9
 *
 * 示例 4:
 * 输入: 'LVIII' 左边大于后边相加
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 *
 * 示例 5:
 * 输入: 'MCMXCIV'
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 * I=1,V=5,X=10,L=50,C=100,D=500,M=1000
 *
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2019/12/8 12:25
 * @Version: V1.0
 */
public class ArithmeticDay004 {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        //建立一个HashMap存储
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] chars = s.toCharArray();
        int back = 0;
        for (int i = 0; i < chars.length-1; i++) {
            if(map.get(chars[i])>=map.get(chars[i+1])){
                //左边大于等于右边加上这个值
                back += map.get(chars[i]);
            }else{
                //左边小于右边减去这个值
                back -= map.get(chars[i]);
            }
        }
        //最后加上末尾的值
        back += map.get(chars[chars.length-1]);
        return back;
    }
}
