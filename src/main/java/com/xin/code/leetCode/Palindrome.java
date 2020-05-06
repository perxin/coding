package com.xin.code.leetCode;

/**
 * @Author: zhengpengxin
 * @Date: 2020/4/27 15:33
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(10101));
    }

    /**
     * 非字符串法
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int y = x;
        while (y != 0) {
            rev = rev * 10 + (y % 10);
            y = y / 10;
        }
        return rev == x;
    }

    /**
     * 字符串法
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();

        boolean isPalindrome = true;

        int m = chars.length / 2;
        for (int i = 0; i < m; i ++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
