package com.company.f015;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] list= Arrays.stream(nums).sorted().toArray();
        int mover;
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if (nums.length<3)
        {
            return lists;
        }
        for (int first = 0;first< list.length;first++){
            if (list[first]>0){
                return lists;
            }
            if (first>0&&list[first-1]==list[first])
            {
                continue;
            }
            int middle = first+1;
            int last = list.length-1;
            while (middle<last) {
                if (list[first] + list[middle] + list[last] == 0) {
                    List<Integer> node = new ArrayList<>();
                    node.add(list[first]);
                    node.add(list[middle]);
                    node.add(list[last]);
                    lists.add(node);
                    while (middle<last && list[middle] == list[middle + 1]) middle++;
                    while (middle<last && list[last] == list[last - 1]) last--;
                    middle++;
                    last--;

                } else if (list[first] + list[middle] + list[last] < 0) {
                    middle++;
                } else {
                    last--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        Solution solution = new Solution();
        List<List<Integer>> lists= solution.threeSum(nums);
        for (List<Integer> list:lists)
        {
            for (Integer number: list)
            {
                System.out.print(number +" ");
            }
            System.out.print("\n");
        }
    }
}
