package com.leetcode.hot100.day03;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0189RotateArrayTest {
    private final P0189RotateArray solution = new P0189RotateArray();

    @Test
    void rotatesArrayByThreePositions() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
        assertArrayEquals(new int[] {5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    void handlesRotationLargerThanArray() {
        int[] nums = {-1, -100, 3, 99};
        solution.rotate(nums, 6);
        assertArrayEquals(new int[] {3, 99, -1, -100}, nums);
    }
}
