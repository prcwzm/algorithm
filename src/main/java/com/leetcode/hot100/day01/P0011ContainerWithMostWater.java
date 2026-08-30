package com.leetcode.hot100.day01;

/**
 * 盛最多水的容器
 */
public class P0011ContainerWithMostWater {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxArea = 0;

        while (i<j) {
            maxArea = Math.max(maxArea, (Math.min(height[i], height[j])) * (j-i));
            if (height[i]<height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}
