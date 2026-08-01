package com.leetcode.hot100.day04;

/** LeetCode 240. 搜索二维矩阵 II。 */
public class P0240SearchA2DMatrixII {

    int[][] direction =  {
            {0,1}, //右移
            {-1,0} //上移移
    };

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int col = 0;
        boolean findTarget = false;
        while(row >= 0 && col <= matrix[0].length - 1 ) {
            if (target == matrix[row][col]){
                return true;
            } else if (target > matrix[row][col]){
                row = row + direction[0][0];
                col = col + direction[0][1];
                //右移
            } else {
                row = row + direction[1][0];
                col = col + direction[1][1];
            }
        }
        return findTarget;
    }
}
