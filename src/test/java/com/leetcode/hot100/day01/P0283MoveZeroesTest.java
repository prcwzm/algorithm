package com.leetcode.hot100.day01;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class P0283MoveZeroesTest {
    private final P0283MoveZeroes solution = new P0283MoveZeroes();

    @Test
    void movesSeparatedZeroesToEnd() {
        assertMoveZeroes(
                new int[] {0, 1, 0, 3, 12},
                new int[] {1, 3, 12, 0, 0});
    }

    @Test
    void handlesLeadingConsecutiveZeroes() {
        assertMoveZeroes(
                new int[] {0, 0, 1},
                new int[] {1, 0, 0});
    }

    @Test
    void handlesTrailingZeroes() {
        assertMoveZeroes(
                new int[] {1, 2, 0, 0},
                new int[] {1, 2, 0, 0});
    }

    @Test
    void handlesArrayContainingOnlyZeroes() {
        assertMoveZeroes(
                new int[] {0, 0, 0},
                new int[] {0, 0, 0});
    }

    @Test
    void leavesArrayWithoutZeroesUnchanged() {
        assertMoveZeroes(
                new int[] {1, 2, 3},
                new int[] {1, 2, 3});
    }

    @Test
    void handlesSingleZero() {
        assertMoveZeroes(new int[] {0}, new int[] {0});
    }

    @Test
    void handlesSingleNonZero() {
        assertMoveZeroes(new int[] {7}, new int[] {7});
    }

    @Test
    void preservesRelativeOrderAcrossZeroRuns() {
        assertMoveZeroes(
                new int[] {4, 0, 0, 2, 0, 1},
                new int[] {4, 2, 1, 0, 0, 0});
    }

    private void assertMoveZeroes(int[] input, int[] expected) {
        solution.moveZeroes(input);
        assertArrayEquals(expected, input);
    }
}
