package com.leetcode.hot100.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class P0054SpiralMatrixTest {
    private final P0054SpiralMatrix solution = new P0054SpiralMatrix();

    @Test
    void traversesSquareMatrixInSpiralOrder() {
        assertEquals(
                List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
                solution.spiralOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void traversesRectangularMatrixInSpiralOrder() {
        assertEquals(
                List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
                solution.spiralOrder(
                        new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

    @Test
    void traversesSingleRowWithoutDuplicates() {
        assertEquals(List.of(1, 2, 3), solution.spiralOrder(new int[][] {{1, 2, 3}}));
    }

    @Test
    void traversesSingleColumnWithoutDuplicates() {
        assertEquals(List.of(1, 2, 3), solution.spiralOrder(new int[][] {{1}, {2}, {3}}));
    }
}
