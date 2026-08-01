package com.leetcode.hot100.practice.matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("完成矩阵边界练习后删除此注解")
class MatrixBoundaryPracticeTest {
    private final MatrixBoundaryPractice practice = new MatrixBoundaryPractice();

    @Test
    void traversesOuterBoundaryClockwise() {
        assertEquals(
                List.of(1, 2, 3, 6, 9, 8, 7, 4),
                practice.outerBoundaryClockwise(
                        new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void handlesSingleRowWithoutDuplicates() {
        assertEquals(
                List.of(1, 2, 3),
                practice.outerBoundaryClockwise(new int[][] {{1, 2, 3}}));
    }
}
