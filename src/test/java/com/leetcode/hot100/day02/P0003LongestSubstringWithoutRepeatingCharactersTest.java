package com.leetcode.hot100.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0003LongestSubstringWithoutRepeatingCharactersTest {
    private final P0003LongestSubstringWithoutRepeatingCharacters solution =
            new P0003LongestSubstringWithoutRepeatingCharacters();

    @Test
    void findsLongestWindow() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void handlesRepeatedSingleCharacter() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void handlesEmptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
}

