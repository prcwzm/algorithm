package com.company.f051;

public class Soution1 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int allCount;
        for (int i = 0;i <nums.length;i++){
            allCount = 0;
            for (int j = i; j< nums.length; j++){
                allCount +=nums[j];
                if(allCount>max)
                {
                    max = allCount;
                }
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Soution1 soution1 = new Soution1();
        System.out.printf(String.valueOf(soution1.maxSubArray(nums)));
    }

}
