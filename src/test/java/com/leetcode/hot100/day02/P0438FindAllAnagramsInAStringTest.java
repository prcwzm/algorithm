package com.leetcode.hot100.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0438FindAllAnagramsInAStringTest {
    private final P0438FindAllAnagramsInAString solution = new P0438FindAllAnagramsInAString();

    @Test
    void findsSeparatedAnagrams() {
        assertEquals(List.of(0, 6), solution.findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    void findsOverlappingAnagrams() {
        assertEquals(List.of(0, 1, 2), solution.findAnagrams("abab", "ab"));
    }
}

