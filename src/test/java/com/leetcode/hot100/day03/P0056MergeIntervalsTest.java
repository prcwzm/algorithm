package com.leetcode.hot100.day03;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

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

    @Test
    void keepsLargerIntervalWhenAnotherIsContained() {
        assertArrayEquals(new int[][] {{1, 10}}, solution.merge(new int[][] {{1, 10}, {2, 3}}));
    }

    @Test
    void sortsIntervalsBeforeMerging() {
        assertArrayEquals(
                new int[][] {{1, 6}, {8, 10}},
                solution.merge(new int[][] {{8, 10}, {2, 6}, {1, 3}}));
    }

    @Test
    void handlesSingleInterval() {
        assertArrayEquals(new int[][] {{1, 2}}, solution.merge(new int[][] {{1, 2}}));
    }
}
