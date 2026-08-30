package com.leetcode.hot100.day01;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode 128. 最长连续序列
 * https://leetcode.cn/problems/longest-consecutive-sequence/
 */
public class P0128LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int maxSeq = 0;
        Set<Integer> numberSet = new HashSet<>();
        //设置list
        for (int num : nums){numberSet.add(num);}

        for (int loopNumber : numberSet) {
            if (numberSet.contains(loopNumber-1)) {
                continue;
            }
            //头节点
            int currentSeq = 0;
            while(numberSet.contains(loopNumber + currentSeq)) currentSeq++;
            maxSeq = Math.max(currentSeq, maxSeq);
        }
        return maxSeq;
    }
}
