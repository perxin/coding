package com.xin.code.leetCode;

/**
 * @Author: zhengpengxin
 * @Date: 2020/4/7 19:50
 */

/**
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 *
 * 不占用额外内存空间能否做到？
 */
public class RotateMatrix {

    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int t = 0;
        //左右翻转
        for (int i = 0; i < n; i ++ ) {
            for (int j = 0; j < n / 2; j ++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = t;
            }
        }
        //对角线翻转
        for (int i = 0; i < n; i ++ ) {
            for (int j = 0; j < n - i; j ++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][n - i - 1];
                matrix[n - j - 1][n - i - 1] = t;
            }
        }
    }
}
