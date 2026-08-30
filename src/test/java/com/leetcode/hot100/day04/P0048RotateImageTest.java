package com.leetcode.hot100.day04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

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

    @Test
    void rotatesFourByFourMatrixClockwise() {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        solution.rotate(matrix);
        assertArrayEquals(
                new int[][] {
                    {13, 9, 5, 1},
                    {14, 10, 6, 2},
                    {15, 11, 7, 3},
                    {16, 12, 8, 4}
                },
                matrix);
    }
}
