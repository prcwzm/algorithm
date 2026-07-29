package com.leetcode.hot100.day03;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class P0238ProductOfArrayExceptSelfTest {
    private final P0238ProductOfArrayExceptSelf solution = new P0238ProductOfArrayExceptSelf();

    @Test
    void calculatesProductsWithoutDivision() {
        assertArrayEquals(
                new int[] {24, 12, 8, 6},
                solution.productExceptSelf(new int[] {1, 2, 3, 4}));
    }

    @Test
    void handlesZeroAndNegativeValues() {
        assertArrayEquals(
                new int[] {0, 0, 9, 0, 0},
                solution.productExceptSelf(new int[] {-1, 1, 0, -3, 3}));
    }

    @Test
    void returnsZeroForEveryPositionWhenThereAreTwoZeroes() {
        assertArrayEquals(new int[] {0, 0, 0}, solution.productExceptSelf(new int[] {0, 1, 0}));
    }
}
