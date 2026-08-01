package com.leetcode.hot100.practice.matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("完成矩阵遍历练习后删除此注解")
class MatrixTraversalPracticeTest {
    private final MatrixTraversalPractice practice = new MatrixTraversalPractice();
    private final int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

    @Test
    void traversesByRows() {
        assertEquals(List.of(1, 2, 3, 4, 5, 6), practice.rowMajorOrder(matrix));
    }

    @Test
    void traversesByColumns() {
        assertEquals(List.of(1, 4, 2, 5, 3, 6), practice.columnMajorOrder(matrix));
    }
}
