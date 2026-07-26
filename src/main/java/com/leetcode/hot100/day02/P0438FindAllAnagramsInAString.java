package com.leetcode.hot100.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** LeetCode 438. 找到字符串中所有字母异位词。 */
public class P0438FindAllAnagramsInAString {

    public List<Integer> findAnagrams1(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for(int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sCount, pCount)) {
            res.add(0);
        }

        for (int i = 0; i < s.length() - p.length(); i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + p.length()) - 'a']++;
            if (Arrays.equals(sCount, pCount)) {
                res.add(i + 1);
            }
        }
        return res;
    }

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        int[] pCount = new int[26];

        for(int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right ++) {
            int  c = s.charAt(right) - 'a';
            pCount[c]--;
            //右边入队
            while (pCount[c]<0) {
                pCount[s.charAt(left) - 'a']++;
                left++;
            }
            if (right - left + 1 == p.length()) {
                res.add(left);
            }
        }
        return res;
    }
}

