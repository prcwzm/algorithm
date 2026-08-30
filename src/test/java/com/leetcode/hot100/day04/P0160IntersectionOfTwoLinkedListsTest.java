package com.leetcode.hot100.day04;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.leetcode.hot100.common.ListNode;
import org.junit.jupiter.api.Test;

class P0160IntersectionOfTwoLinkedListsTest {
    private final P0160IntersectionOfTwoLinkedLists solution =
            new P0160IntersectionOfTwoLinkedLists();

    @Test
    void returnsSharedNodeByIdentity() {
        ListNode shared = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA = new ListNode(4, new ListNode(1, shared));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, shared)));

        assertSame(shared, solution.getIntersectionNode(headA, headB));
    }

    @Test
    void returnsNullWhenListsDoNotIntersect() {
        ListNode headA = new ListNode(1, new ListNode(2));
        ListNode headB = new ListNode(1, new ListNode(2));

        assertNull(solution.getIntersectionNode(headA, headB));
    }
}
