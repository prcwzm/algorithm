package com.leetcode.hot100.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0560SubarraySumEqualsKTest {
    private final P0560SubarraySumEqualsK solution = new P0560SubarraySumEqualsK();

    @Test
    void countsOverlappingSubarrays() {
        assertEquals(2, solution.subarraySum(new int[] {1, 1, 1}, 2));
    }

    @Test
    void countsDifferentLengthSubarrays() {
        assertEquals(2, solution.subarraySum(new int[] {1, 2, 3}, 3));
    }

    @Test
    void handlesNegativeValues() {
        assertEquals(3, solution.subarraySum(new int[] {1, -1, 0}, 0));
    }
}
