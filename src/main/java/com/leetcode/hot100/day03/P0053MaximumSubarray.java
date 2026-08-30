package com.leetcode.hot100.day03;

/** LeetCode 53. 最大子数组和。 */
public class P0053MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int cur = 0;
        for (int num : nums) {
            cur = Math.max(num, num + cur);
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
