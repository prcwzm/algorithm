package com.leetcode.hot100.day04;

/** LeetCode 73. 矩阵置零。 */
public class P0073SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int colSize = matrix[0].length;
        int rowSize = matrix.length;
        boolean rowZero = false;
        boolean colZero = false;
        for (int col = 0; col < colSize; col++) {
            for (int row = 0; row < rowSize; row++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                    if (row == 0){
                        rowZero = true;
                    }
                    if (col==0){
                        colZero = true;
                    }
                }
            }
        }

        for (int col = 1; col < colSize; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 1; row < rowSize; row++) {
                        matrix[row][col] = 0;
                }
            }
        }
        for (int row = 1 ; row < rowSize; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 1 ; col < colSize; col ++) {
                    matrix[row][col] = 0;
                }
            }
        }
        if (rowZero) {
            for (int i = 0; i < colSize; i++) {
                matrix[0][i] = 0;
            }
        }
        if (colZero) {
            for (int i = 0; i < rowSize; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
