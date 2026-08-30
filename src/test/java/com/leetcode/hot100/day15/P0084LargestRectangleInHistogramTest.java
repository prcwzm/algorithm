package com.leetcode.hot100.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0084LargestRectangleInHistogramTest {
    @Test
    void findsLargestRectangle() {
        assertEquals(10, new P0084LargestRectangleInHistogram()
                .largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));
    }
}
