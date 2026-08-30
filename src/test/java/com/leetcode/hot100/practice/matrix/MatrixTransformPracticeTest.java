package com.leetcode.hot100.practice.matrix;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("完成矩阵变换练习后删除此注解")
class MatrixTransformPracticeTest {
    private final MatrixTransformPractice practice = new MatrixTransformPractice();

    @Test
    void transposesRectangularMatrix() {
        assertArrayEquals(
                new int[][] {{1, 4}, {2, 5}, {3, 6}},
                practice.transpose(new int[][] {{1, 2, 3}, {4, 5, 6}}));
    }

    @Test
    void flipsMatrixHorizontallyInPlace() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        practice.flipHorizontally(matrix);
        assertArrayEquals(new int[][] {{3, 2, 1}, {6, 5, 4}}, matrix);
    }
}
