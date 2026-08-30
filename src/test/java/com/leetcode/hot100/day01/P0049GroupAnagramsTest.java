package com.leetcode.hot100.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class P0049GroupAnagramsTest {
    private final P0049GroupAnagrams solution = new P0049GroupAnagrams();

    @Test
    void groupsTypicalInput() {
        assertEquals(
                frequencies(List.of(List.of("eat", "tea", "ate"), List.of("tan", "nat"), List.of("bat"))),
                frequencies(solution.groupAnagrams(
                        new String[] {"eat", "tea", "tan", "ate", "nat", "bat"})));
    }

    @Test
    void handlesEmptyString() {
        assertEquals(
                frequencies(List.of(List.of(""))),
                frequencies(solution.groupAnagrams(new String[] {""})));
    }

    @Test
    void handlesSingleCharacter() {
        assertEquals(
                frequencies(List.of(List.of("a"))),
                frequencies(solution.groupAnagrams(new String[] {"a"})));
    }

    @Test
    void preservesDuplicateStrings() {
        assertEquals(
                frequencies(List.of(List.of("ab", "ba", "ab"), List.of("aa"))),
                frequencies(solution.groupAnagrams(new String[] {"ab", "ba", "ab", "aa"})));
    }

    private Map<Map<String, Integer>, Integer> frequencies(List<List<String>> groups) {
        Map<Map<String, Integer>, Integer> normalized = new HashMap<>();
        for (List<String> group : groups) {
            Map<String, Integer> words = new HashMap<>();
            for (String word : group) {
                words.merge(word, 1, Integer::sum);
            }
            normalized.merge(words, 1, Integer::sum);
        }
        return normalized;
    }
}
