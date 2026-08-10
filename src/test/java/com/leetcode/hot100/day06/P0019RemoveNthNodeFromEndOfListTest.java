package com.leetcode.hot100.day06;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.leetcode.hot100.common.ListNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0019RemoveNthNodeFromEndOfListTest {
    private final P0019RemoveNthNodeFromEndOfList solution =
            new P0019RemoveNthNodeFromEndOfList();

    @Test
    void removesSecondNodeFromEnd() {
        ListNode head = new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertArrayEquals(new int[] {1, 2, 3, 5}, values(solution.removeNthFromEnd(head, 2)));
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
