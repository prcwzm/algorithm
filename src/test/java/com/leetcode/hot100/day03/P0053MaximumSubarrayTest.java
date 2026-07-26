package com.leetcode.hot100.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0053MaximumSubarrayTest {
    private final P0053MaximumSubarray solution = new P0053MaximumSubarray();

    @Test
    void findsMaximumSubarrayAcrossMixedValues() {
        assertEquals(6, solution.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void handlesSingleElement() {
        assertEquals(1, solution.maxSubArray(new int[] {1}));
    }
}
