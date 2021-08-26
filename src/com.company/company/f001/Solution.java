package com.company.f001;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        for (int num : nums){
            if (map.containsKey(target-num))
            {
                return new int[]{map.get(target-num),i};
            }else {
                map.put(num,i);
                i++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] a ={2,7,11,15};
        Solution solution = new Solution();
        int[] b = solution.twoSum(a,9);
        for (int c: b){
            System.out.printf(String.valueOf(c));
        }

    }
}