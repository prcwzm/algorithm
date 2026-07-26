package com.leetcode.hot100.day02;

import java.util.HashMap;
import java.util.Map;

/** LeetCode 560. 和为 K 的子数组。 */
public class P0560SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> s = new HashMap<>();
        int count = 0;
        int pre = 0;
        s.put(0,1);
        for (int num : nums) {
            pre += num; // 记录前缀和
            if (s.containsKey(pre - k)) {
                count += s.get(pre - k);
            }
            s.put(pre, s.getOrDefault(pre, 0) + 1);
        }
        return count;

    }
}
