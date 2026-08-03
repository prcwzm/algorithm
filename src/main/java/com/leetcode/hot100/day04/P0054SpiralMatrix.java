package com.leetcode.hot100.day04;

import java.util.ArrayList;
import java.util.List;

/** LeetCode 54. 螺旋矩阵。 */
public class P0054SpiralMatrix {


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }
        int rows  = matrix.length;
        int cols = matrix[0].length;
        int top = 0, left = 0, right = cols - 1, bottom = rows -1;

        while (left <= right && top <= bottom) {
            //向右遍历
            for (int c = left; c <= right; c++) {
                ans.add(matrix[top][c]);
            }
            for (int r = top + 1; r <= bottom; r++) {
                ans.add(matrix[r][right]);
            }
            if (left < right && top < bottom) {
                for (int c = right - 1; c > left; c--) {
                    ans.add(matrix[bottom][c]);
                }
                for (int r = bottom; r > top; r--) {
                    ans.add(matrix[r][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        return ans;
    }
}
