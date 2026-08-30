package com.leetcode.hot100.day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 49. 字母异位词分组
 * https://leetcode.cn/problems/group-anagrams/
 *
 * <p>思路：TODO
 *
 * <p>时间复杂度：TODO；空间复杂度：TODO。
 */
public class P0049GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

            for (String str : strs) {
                String key = constructKey(str);
//                if (map.containsKey(key)) {
//                    map.get(key).add(str);
//                } else {
//                    List<String> newList = new ArrayList<>();
//                    newList.add(str);
//                    map.put(key, newList);
//                }
                List<String> list = map.getOrDefault(key, new ArrayList<String>());
                list.add(str);
                map.put(key, list);
            }
//        List<List<String>> returnLists = new ArrayList<>();
//        for (Map.Entry<String,List<String>> entry :map.entrySet())
//        {
//            returnLists.add(entry.getValue());
//        }
//        return returnLists;
        return new ArrayList<>(map.values());
    }

    public String constructKey(String str) {
        int[] mapList = new int[26];
        for (char c : str.toCharArray()) {
            int i = c - 'a';
            mapList[i]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < mapList.length; i++) {
            sb.append(i).append(":").append(mapList[i]);
        }

        return sb.toString();
    }
}
