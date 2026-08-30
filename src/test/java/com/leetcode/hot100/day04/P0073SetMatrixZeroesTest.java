package com.leetcode.hot100.day04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class P0073SetMatrixZeroesTest {
    private final P0073SetMatrixZeroes solution = new P0073SetMatrixZeroes();

    @Test
    void zeroesMatchingRowAndColumn() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[][] {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, matrix);
    }

    @Test
    void handlesZeroInFirstRowAndColumn() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[][] {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}}, matrix);
    }

    @Test
    void handlesZeroInLastRow() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 0}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[][] {{1, 2, 0}, {0, 0, 0}}, matrix);
    }

    @Test
    void zeroesSingleRowContainingZero() {
        int[][] matrix = {{1, 0, 3}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[][] {{0, 0, 0}}, matrix);
    }
}
