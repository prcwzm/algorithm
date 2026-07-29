package com.leetcode.hot100.day03;

/** LeetCode 238. 除自身以外数组的乘积。 */
public class P0238ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[nums.length - 1] = 1; //最后一位是1因为他右边的元素不存在所以说乘积为1
        for (int i = nums.length - 2; i >= 0; i--) {
            ans[i] = ans[i + 1] * nums[i + 1]; // 用前一位ans累加生成结果序列
        }
        //用变量记录上一个loop的值
        int leftloop = 1;
        for (int i = 0 ; i < nums.length; i++) {
            ans[i] = leftloop * ans[i];
            leftloop = nums[i]*leftloop;
        }
        return ans;
    }
}
