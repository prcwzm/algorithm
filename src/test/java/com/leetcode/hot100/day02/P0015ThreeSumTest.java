package com.leetcode.hot100.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class P0015ThreeSumTest {
    private final P0015ThreeSum solution = new P0015ThreeSum();

    @Test
    void findsUniqueTriplets() {
        Set<List<Integer>> actual = normalize(
                solution.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
        assertEquals(Set.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), actual);
    }

    @Test
    void returnsEmptyWhenNoTripletExists() {
        assertEquals(List.of(), solution.threeSum(new int[] {0, 1, 1}));
    }

    @Test
    void handlesDuplicatesAndSeveralUniqueTriplets() {
        Set<List<Integer>> actual = normalize(solution.threeSum(
                new int[] {-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0}));

        assertEquals(
                Set.of(
                        List.of(-5, 1, 4),
                        List.of(-4, 0, 4),
                        List.of(-4, 1, 3),
                        List.of(-2, -2, 4),
                        List.of(-2, 1, 1),
                        List.of(0, 0, 0)),
                actual);
    }

    private Set<List<Integer>> normalize(List<List<Integer>> triplets) {
        Set<List<Integer>> normalized = new HashSet<>();
        for (List<Integer> triplet : triplets) {
            List<Integer> sorted = new ArrayList<>(triplet);
            Collections.sort(sorted);
            normalized.add(sorted);
        }
        return normalized;
    }
}
