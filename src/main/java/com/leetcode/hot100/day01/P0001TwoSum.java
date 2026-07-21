package com.leetcode.hot100.day01;

import java.util.HashMap;
import java.util.Map;

/** LeetCode 1. 两数之和；时间 O(n)，空间 O(n)。 */
public class P0001TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> checkKey = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            //计算差值是否已存在，存在则输出结果
            if (checkKey.containsKey(target - nums[i])) {
                return new int[]{checkKey.get(target-nums[i]),i};
            } else {
                checkKey.put(nums[i], i);
            }
            //不存在则插入到checkKey中
        }
        return new int[]{};
    }
}

