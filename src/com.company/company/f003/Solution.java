package com.company.f003;

import java.util.*;

class Solution {
        public int lengthOfLongestSubstring(String s) {
            Queue<String> queue = new LinkedList<>();
            int count = 0;
            int max = 0;
            String tempchar;
            for (int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(queue.contains(String.valueOf(ch))){
                    if(count>max)
                    {
                        max = count;
                    }
                    do{
                        tempchar = queue.poll();
                        count--;
                    }while(!tempchar.equals(String.valueOf(ch)));
                }
                queue.add(String.valueOf(ch));
                count++;
            }
            if(count>max){
                max = count;
            }
            return max;
        }

    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring(s);
        System.out.printf(String.valueOf(result));;

    }
}