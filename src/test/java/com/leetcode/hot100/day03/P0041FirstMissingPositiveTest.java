package com.leetcode.hot100.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0041FirstMissingPositiveTest {
    private final P0041FirstMissingPositive solution = new P0041FirstMissingPositive();

    @Test
    void findsGapInsidePositiveRange() {
        assertEquals(2, solution.firstMissingPositive(new int[] {3, 4, -1, 1}));
    }

    @Test
    void findsMissingValueAfterConsecutiveRange() {
        assertEquals(3, solution.firstMissingPositive(new int[] {1, 2, 0}));
    }
}
