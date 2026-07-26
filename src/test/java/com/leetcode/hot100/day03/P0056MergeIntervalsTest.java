package com.leetcode.hot100.day03;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0056MergeIntervalsTest {
    private final P0056MergeIntervals solution = new P0056MergeIntervals();

    @Test
    void mergesOverlappingIntervals() {
        assertArrayEquals(
                new int[][] {{1, 6}, {8, 10}, {15, 18}},
                solution.merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    void mergesTouchingIntervals() {
        assertArrayEquals(new int[][] {{1, 5}}, solution.merge(new int[][] {{1, 4}, {4, 5}}));
    }
}
