package com.leetcode.hot100.day15;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0347TopKFrequentElementsTest {
    @Test
    void findsMostFrequentElements() {
        assertArrayEquals(new int[] {1, 2}, new P0347TopKFrequentElements()
                .topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
    }
}
