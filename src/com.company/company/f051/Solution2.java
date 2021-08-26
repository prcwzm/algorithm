package com.company.f051;

public class Solution2 {
    public int maxSubArray(int[] nums) {
        int dp = nums[0];
        int max = nums[0];
        if (nums.length==1)
        {
            return nums[0];
        }
        for (int i=1; i<nums.length;i++)
        {
            dp = (dp + nums[i]) > nums[i]?dp + nums[i]:nums[i];
            if (dp>max){
                max = dp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Solution2 solution2 = new Solution2();
        System.out.printf(String.valueOf(solution2.maxSubArray(nums)));
    }
}
