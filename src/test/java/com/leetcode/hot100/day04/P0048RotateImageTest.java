package com.leetcode.hot100.day04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0048RotateImageTest {
    private final P0048RotateImage solution = new P0048RotateImage();

    @Test
    void rotatesThreeByThreeMatrixClockwise() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution.rotate(matrix);
        assertArrayEquals(new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, matrix);
    }

    @Test
    void rotatesTwoByTwoMatrixClockwise() {
        int[][] matrix = {{1, 2}, {3, 4}};
        solution.rotate(matrix);
        assertArrayEquals(new int[][] {{3, 1}, {4, 2}}, matrix);
    }
}
