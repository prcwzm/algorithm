package com.company.f215;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue= new PriorityQueue<>((n1,n2)->n1-n2);
        for(int value: nums)
        {
            queue.add(value);
            if (queue.size()>k)
            {
                queue.poll();
            }
        }
        return queue.poll();
    }
}

