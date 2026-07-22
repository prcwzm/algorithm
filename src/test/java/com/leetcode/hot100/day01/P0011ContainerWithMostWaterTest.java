package com.leetcode.hot100.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0011ContainerWithMostWaterTest {

    private final P0011ContainerWithMostWater solution = new P0011ContainerWithMostWater();

    @Test
    void findsMaximumAreaInOfficialExample() {
        assertEquals(49, solution.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void handlesTwoLines() {
        assertEquals(1, solution.maxArea(new int[] {1, 1}));
    }

    @Test
    void handlesIncreasingHeights() {
        assertEquals(4, solution.maxArea(new int[] {2, 4, 6}));
    }

    @Test
    void keepsFullDistanceBetweenBothSides() {
        assertEquals(1, solution.maxArea(new int[] {1, 1}));
    }

    @Test
    void handlesSingleLine() {
        assertEquals(0, solution.maxArea(new int[] {5}));
    }

    @Test
    void handlesEmptyInput() {
        assertEquals(0, solution.maxArea(new int[] {}));
    }
}
