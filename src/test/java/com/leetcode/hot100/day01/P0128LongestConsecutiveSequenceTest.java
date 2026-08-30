package com.leetcode.hot100.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P0128LongestConsecutiveSequenceTest {

    private final P0128LongestConsecutiveSequence solution =
            new P0128LongestConsecutiveSequence();

    @Test
    void findsLongestSequenceInTypicalInput() {
        assertEquals(4, solution.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }

    @Test
    void findsSequenceInUnorderedInput() {
        assertEquals(9,
                solution.longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    void ignoresDuplicateNumbers() {
        assertEquals(3, solution.longestConsecutive(new int[] {1, 2, 2, 3}));
    }

    @Test
    void handlesNegativeNumbers() {
        assertEquals(4, solution.longestConsecutive(new int[] {-2, -1, 0, 1, 10}));
    }

    @Test
    void handlesSingleNumber() {
        assertEquals(1, solution.longestConsecutive(new int[] {42}));
    }

    @Test
    void handlesEmptyInput() {
        assertEquals(0, solution.longestConsecutive(new int[] {}));
    }

    @Test
    void countsDuplicateValueOnlyOnce() {
        assertEquals(1, solution.longestConsecutive(new int[] {7, 7, 7, 7}));
    }

    @Test
    void handlesDescendingSequence() {
        assertEquals(5, solution.longestConsecutive(new int[] {5, 4, 3, 2, 1}));
    }

    @Test
    void choosesLongestOfSeveralSequences() {
        assertEquals(4,
                solution.longestConsecutive(new int[] {10, 11, 1, 2, 3, 4, 20, 21, 22}));
    }

    @Test
    void doesNotCrossMissingNumber() {
        assertEquals(2, solution.longestConsecutive(new int[] {1, 2, 4, 5}));
    }
}
