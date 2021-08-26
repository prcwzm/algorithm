package com.company.f051;

public class Solution3 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i = 0 ; i< nums.length ; i++){
            sum += nums[i];
            if (sum >max)
            {
                max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Solution3 solution3 = new Solution3();
        System.out.printf(String.valueOf(solution3.maxSubArray(nums)));
    }
}
