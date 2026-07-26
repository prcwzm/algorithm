package com.leetcode.hot100.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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

    @Test
    void movesPastDuplicateInsideCurrentWindow() {
        assertEquals(2, solution.lengthOfLongestSubstring("abba"));
    }

    @Test
    void keepsCharacterWhoseOldOccurrenceLeftTheWindow() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void preservesHistoricalMaximumAfterWindowShrinks() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void handlesSeveralWindowMoves() {
        assertEquals(5, solution.lengthOfLongestSubstring("tmmzuxt"));
    }

    @Test
    void treatsSpaceAsACharacter() {
        assertEquals(1, solution.lengthOfLongestSubstring(" "));
    }

    @Test
    void handlesTwoDifferentCharacters() {
        assertEquals(2, solution.lengthOfLongestSubstring("au"));
    }

    @Test
    void handlesRepeatedCharacterAfterPreviousWindowShrink() {
        assertEquals(3, solution.lengthOfLongestSubstring("cbcba"));
    }

    @Test
    void findsLongWindowAfterMultipleEarlierDuplicates() {
        assertEquals(7, solution.lengthOfLongestSubstring("bpfbhmipx"));
    }
}
