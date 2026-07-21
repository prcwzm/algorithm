package com.leetcode.hot100.day01;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class P0001TwoSumTest {
    private final P0001TwoSum solution = new P0001TwoSum();

    @Test
    void findsPair() {
        assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    void handlesDuplicateValues() {
        assertArrayEquals(new int[] {0, 1}, solution.twoSum(new int[] {3, 3}, 6));
    }

    @Test
    void returnsEmptyArrayWhenNoPairExists() {
        assertArrayEquals(new int[] {}, solution.twoSum(new int[] {1, 2}, 10));
    }
}
