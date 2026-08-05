package com.leetcode.hot100.day05;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.hot100.common.ListNode;
import org.junit.jupiter.api.Test;

class P0141LinkedListCycleTest {
    private final P0141LinkedListCycle solution = new P0141LinkedListCycle();

    @Test
    void detectsCycle() {
        ListNode second = new ListNode(2);
        ListNode head = new ListNode(1, second);
        second.next = new ListNode(3, second);
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void rejectsAcyclicList() {
        assertFalse(solution.hasCycle(new ListNode(1, new ListNode(2))));
    }
}
