package com.leetcode.hot100.day02;

import java.util.*;

/** LeetCode 3. 无重复字符的最长子串。 */
public class P0003LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        Set<Character> occSet = new HashSet<>();
        int ans = 0;
        int k = -1;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                occSet.remove(s.charAt(i - 1));
            }
            while(k+1 < n && !occSet.contains(s.charAt(k + 1))) {
                occSet.add(s.charAt(k + 1));
                k++;
            }
            ans = Math.max(ans, k - i + 1);
        }
        return ans;
    }

    public int lengthOfLongestSubstringFirstAttempt(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int[] dp = new int[s.length()];
        Map<Character, Integer> uniMap = new HashMap<>();
        int maxSeq = 1;
        int i = 0;
        dp[0] = 1;
        for (char c : chars) {
            if (i == 0) {
                uniMap.put(c, i);
                i++;
                continue;
            }
            //判断当前c在Map 中是否存在
            if (!uniMap.containsKey(c)) {
                //不存在
                dp[i] = dp[i-1] + 1;
            } else {
                //存在
                clearItemBefore(uniMap, c);
                dp[i] = uniMap.size() + 1;

            }
            maxSeq = Math.max(maxSeq,dp[i]);
            uniMap.put(c,i);
            i++;
        }
        return  maxSeq;
    }

    public void clearItemBefore(Map<Character, Integer> uniMap, char s) {
        int i = uniMap.get(s);
        List<Character> characters = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : uniMap.entrySet()) {
            if (entry.getValue() <= i) {
                characters.add(entry.getKey());
            }
        }
        for (Character c : characters) {
            uniMap.remove(c);
        }

    }
}
