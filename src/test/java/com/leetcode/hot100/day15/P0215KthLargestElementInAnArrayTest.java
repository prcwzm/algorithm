package com.leetcode.hot100.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0215KthLargestElementInAnArrayTest {
    @Test
    void findsSecondLargestElement() {
        assertEquals(5, new P0215KthLargestElementInAnArray()
                .findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
    }
}
