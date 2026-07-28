package com.leetcode.hot100.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** LeetCode 56. 合并区间。 */
public class P0056MergeIntervals {

    public int[][] merge(int[][] intervals) {
        //比较排序
        Arrays.sort(intervals, Comparator.comparingInt(p -> p[0]));

        List<int[]> ans = new ArrayList<>();
        for (int[] p : intervals) {
            int m = ans.size(); // 用于记录当前的m长度
            if ( m > 0 && (p[0] <= ans.get(m - 1)[1])) {  //边界条件
                //需要合并
                ans.get(m-1)[1] = Math.max(ans.get(m - 1)[1], p[1]);
            } else {
                //不需要合并
                ans.add(p);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
