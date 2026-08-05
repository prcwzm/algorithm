package com.leetcode.hot100.day05;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.hot100.common.ListNode;
import org.junit.jupiter.api.Test;

class P0234PalindromeLinkedListTest {
    private final P0234PalindromeLinkedList solution = new P0234PalindromeLinkedList();

    @Test
    void recognizesPalindrome() {
        assertTrue(solution.isPalindrome(
                new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
    }

    @Test
    void rejectsNonPalindrome() {
        assertFalse(solution.isPalindrome(new ListNode(1, new ListNode(2))));
    }

    @Test
    void rejectsNonPalindromeWithMatchingEnds() {
        assertFalse(solution.isPalindrome(
                new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1))))));
    }
}
