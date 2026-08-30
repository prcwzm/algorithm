package com.leetcode.hot100.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0121BestTimeToBuyAndSellStockTest {
    @Test
    void calculatesMaximumProfit() {
        assertEquals(5, new P0121BestTimeToBuyAndSellStock()
                .maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }
}
