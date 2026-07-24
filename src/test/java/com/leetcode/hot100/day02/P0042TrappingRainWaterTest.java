package com.leetcode.hot100.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0042TrappingRainWaterTest {
    private final P0042TrappingRainWater solution = new P0042TrappingRainWater();

    @Test
    void trapsWaterAcrossSeveralBasins() {
        assertEquals(6, solution.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void trapsWaterInDeepBasin() {
        assertEquals(9, solution.trap(new int[] {4, 2, 0, 3, 2, 5}));
    }
}

