package com.leetcode.hot100.day05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.leetcode.hot100.common.ListNode;
import org.junit.jupiter.api.Test;

class P0206ReverseLinkedListTest {
    private final P0206ReverseLinkedList solution = new P0206ReverseLinkedList();

    @Test
    void reversesSeveralNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        assertArrayEquals(new int[] {3, 2, 1}, values(solution.reverseList(head)));
    }

    @Test
    void handlesEmptyList() {
        assertNull(solution.reverseList(null));
    }

    private int[] values(ListNode head) {
        java.util.List<Integer> values = new java.util.ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values.stream().mapToInt(Integer::intValue).toArray();
    }
}
