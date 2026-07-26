package com.leetcode.hot100.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

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

    @Test
    void returnsEmptyWhenPatternIsLongerThanSource() {
        assertEquals(List.of(), solution.findAnagrams("ab", "abc"));
    }

    @Test
    void respectsRepeatedCharacterCounts() {
        assertEquals(List.of(1), solution.findAnagrams("baa", "aa"));
    }

    @Test
    void returnsEmptyWhenNoAnagramExists() {
        assertEquals(List.of(), solution.findAnagrams("abcd", "ee"));
    }
}
