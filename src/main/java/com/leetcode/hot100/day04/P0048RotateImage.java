package com.leetcode.hot100.day04;

/** LeetCode 48. 旋转图像。 */
public class P0048RotateImage {

    public void rotate(int[][] matrix) {
        int ml = matrix.length;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < (matrix.length + 1) / 2 ; j ++) {
                fourPointChange(matrix, i, j, ml);
            }
        }
    }

    public void fourPointChange(int[][] matrix, int i, int j, int ml) {
        int m1 = matrix[i][j];
        int m2 = matrix[j][ml - 1 - i];
        int m3 = matrix[ml - 1 - i][ml - 1 - j];
        int tmp = matrix[ml - 1 - j][i];
        matrix[ml - 1 - j][i] = m3;
        matrix[ml - 1 - i][ml - 1 - j] = m2;
        matrix[j][ml - 1 - i] = m1;
        matrix[i][j] = tmp;
    }
}
