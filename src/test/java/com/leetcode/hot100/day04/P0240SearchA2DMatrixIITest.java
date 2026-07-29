package com.leetcode.hot100.day04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0240SearchA2DMatrixIITest {
    private final P0240SearchA2DMatrixII solution = new P0240SearchA2DMatrixII();
    private final int[][] matrix = {
        {1, 4, 7, 11, 15},
        {2, 5, 8, 12, 19},
        {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
    };

    @Test
    void findsExistingTarget() {
        assertTrue(solution.searchMatrix(matrix, 5));
    }

    @Test
    void rejectsMissingTarget() {
        assertFalse(solution.searchMatrix(matrix, 20));
    }
}
