package com.leetcode.hot100.day02;

import java.util.*;

/** LeetCode 15. 三数之和。 */
public class P0015ThreeSum {

    public List<List<Integer>> threeSum1(int[] nums) {
        Map<Integer, Set<Integer>> keyMap = new HashMap<>();
        Arrays.sort(nums);
        //Map
        for (int i = 0 ; i < nums.length; i++) {
            keyMap.computeIfAbsent(nums[i], key -> new HashSet<>()).add(i);
        }

        HashMap<String,List<Integer>> threeSum = new HashMap<>();
        //i j 遍历列表，如果匹配出来的值在j前面意味着已被匹配跳过
        for (int i = 0; i < nums.length - 1;) {
                for (int j = i + 1; j < nums.length;) {
                    int targetValue = -(nums[i] + nums[j]);
                        if (keyMap.containsKey(targetValue)) {
                            if (!((nums[j] == targetValue||nums[i] == targetValue) && keyMap.get(targetValue).size() == 1) && !((nums[j] == nums[i] && nums[i] == targetValue) && keyMap.get(targetValue).size() == 2)) {
                                List<Integer> innerList = new ArrayList<>();
                                int max = Math.max(Math.max(nums[i],nums[j]),targetValue);
                                int min = Math.min(Math.min(nums[i],nums[j]),targetValue);
                                int middle = -(max + min);
                                innerList.add(min);
                                innerList.add(middle);
                                innerList.add(max);
                                String key = Integer.toString(min) + middle + max;
                                if (!threeSum.containsKey(key)){
                                    threeSum.put(key,innerList);
                                }
                            }
                        }
                    //提速
                    do {
                        j++;
                    } while (j + 1 < nums.length && nums[j] == nums[j + 1]);
                }
                int loop = 0;
                do {
                    i++;
                    loop++;
                } while (i + 1 < nums.length - 1 && nums[i] == nums[i + 1]);
                if (loop > 2) {
                    i--;
                }
            }
        return new ArrayList<>(threeSum.values());
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k< nums.length - 2; k++){
            if (nums[k] > 0 ) continue;
            if (k>0 && nums[k - 1] == nums[k]) continue;
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                int s = nums[i] + nums[j] + nums[k];
                if (s < 0) {
                    while (i < j && nums[i] == nums[++i]);
                } else if ( s > 0) {
                    while (i < j && nums[j] == nums[--j]);
                } else {
                    List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[j]);
                    item.add(nums[k]);
                    res.add(item);
                    while (i < j && nums[i] == nums[++i]);
                    while (i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }
}

