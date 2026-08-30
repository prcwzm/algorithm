package com.leetcode.hot100.day06;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.leetcode.hot100.common.ListNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0024SwapNodesInPairsTest {
    private final P0024SwapNodesInPairs solution = new P0024SwapNodesInPairs();

    @Test
    void swapsAdjacentNodes() {
        ListNode head = new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4))));
        assertArrayEquals(new int[] {2, 1, 4, 3}, values(solution.swapPairs(head)));
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
