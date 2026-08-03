package com.leetcode.hot100.day05;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.leetcode.hot100.common.ListNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0142LinkedListCycleIITest {
    private final P0142LinkedListCycleII solution = new P0142LinkedListCycleII();

    @Test
    void returnsCycleEntryNode() {
        ListNode entry = new ListNode(2);
        ListNode head = new ListNode(1, entry);
        entry.next = new ListNode(3, new ListNode(4, entry));
        assertSame(entry, solution.detectCycle(head));
    }

    @Test
    void returnsNullForAcyclicList() {
        assertNull(solution.detectCycle(new ListNode(1, new ListNode(2))));
    }
}
