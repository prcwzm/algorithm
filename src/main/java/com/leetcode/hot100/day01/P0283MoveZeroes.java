package com.leetcode.hot100.day01;

/**
 * LeetCode 283. 移动零
 * https://leetcode.cn/problems/move-zeroes/
 *
 * <p>要求：原地修改数组，不复制数组。
 */
public class P0283MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zero = nums.length - 1;

        while(nums[zero]==0) {
            zero--;
            if (zero < 0) {
                //结束 说明已经到头了
                break;
            }
        }
        int nonZeroPtr = zero;

        while(zero > 0 && nonZeroPtr > 0) {
            while (nums[nonZeroPtr] != 0) {
                nonZeroPtr --;
                if (nonZeroPtr < 0) {
                    //结束 说明已经到头了
                    break;
                }
            }
            if (nonZeroPtr < 0) {
                //结束 说明已经到头了
                break;
            }
            swap(nums, nonZeroPtr, nonZeroPtr + 1, zero);
            zero--;
        }
    }

    // 数组前推
    public void swap(int[] swapNums, int start, int swapStart, int swapEnd) {
        for (int i = swapStart; i <= swapEnd; i++) {
            swapItem(swapNums, start++, i);
        }
    }

    public void swapItem(int[] swapNums, int i, int j) {
        int tmpValue = swapNums[i];
        swapNums[i] = swapNums[j];
        swapNums[j] = tmpValue;
    }
}
