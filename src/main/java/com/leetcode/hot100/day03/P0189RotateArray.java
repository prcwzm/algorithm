package com.leetcode.hot100.day03;

import java.util.ArrayDeque;
import java.util.Queue;

/** LeetCode 189. 轮转数组。 */
public class P0189RotateArray {

    public void rotateAlternative(int[] nums, int k) {
        if (k > nums.length) {
            k = k%nums.length;
        }
        Queue<Integer> s = new ArrayDeque<>();
        int length = nums.length;
        for (int i = 0; i < k; i++) {
            s.offer(nums[length - (k - i) ]);
        }

        for (int i = length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = s.poll();
        }
    }

    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[end];
            nums[end] = nums[start];
            nums[start] = tmp;
            start++;
            end--;
        }
    }
}
