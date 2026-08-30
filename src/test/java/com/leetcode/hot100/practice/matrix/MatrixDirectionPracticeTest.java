package com.leetcode.hot100.practice.matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("完成方向数组练习后删除此注解")
class MatrixDirectionPracticeTest {
    private final MatrixDirectionPractice practice = new MatrixDirectionPractice();
    private final int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    @Test
    void returnsFourNeighborsForCenter() {
        assertEquals(List.of(2, 6, 8, 4), practice.orthogonalNeighbors(matrix, 1, 1));
    }

    @Test
    void ignoresDirectionsOutsideMatrix() {
        assertEquals(List.of(2, 4), practice.orthogonalNeighbors(matrix, 0, 0));
    }
}
