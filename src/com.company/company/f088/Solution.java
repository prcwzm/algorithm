package com.company.f088;

import com.company.f202.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        if (m == 0)
        {
            num1[0]=num2[0];
        }
        if (n == 0)
        {
            return;
        }
        int firstPtr = 0;
        int secondPtr = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<m+n;i++)
        {
            if (firstPtr<m&&secondPtr<n&&num1[firstPtr]>num2[secondPtr])
            {
                list.add(num2[secondPtr++]);

            } else if (firstPtr<m&&secondPtr<n&&num1[firstPtr]<=num2[secondPtr])
            {
                list.add(num1[firstPtr++]);

            } else if (firstPtr<m)
            {
                list.add(num1[firstPtr++]);
            } else if (secondPtr<n){
                list.add(num2[secondPtr++]);
            }
        }
        int i=0;
        for (Integer integer :list)
        {
            num1[i++] = integer;
        }
    }
    public static void main(String[] args) {
            int[] num1 = {1,2,3,0,0,0};
            int[] num2 = {2,5,6};
            Solution solution = new Solution();
        solution.merge(num1,3,num2,3);
        System.out.println(num1);
    }
}
