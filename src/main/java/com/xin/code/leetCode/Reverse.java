package com.xin.code.leetCode;

/**
 * @Author: zhengpengxin
 * @Date: 2020/4/8 14:16
 */

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Reverse {

    public int reverse1(int x) {
        int res = 0;
        while (x != 0) {
            int remain = x % 10;
            if ((res * 10 + remain) / 10 != res) {
                return 0;
            }
            res = res * 10 + remain;
            x /= 10;
        }
        return res;
    }

    public int reverse2(int x) {
        int absX = x < 0 ? -x : x;
        String s = String.valueOf(absX);
        char[] chars = s.toCharArray();
        String rs = "";
        for (int i = chars.length - 1; i >= 0; i --) {
            rs += chars[i];
        }

        Integer rx;
        try {
            rx = Integer.valueOf(rs);
        } catch (NumberFormatException e) {
            return 0;
        }

        return x < 0 ? -rx : rx;
    }


}
