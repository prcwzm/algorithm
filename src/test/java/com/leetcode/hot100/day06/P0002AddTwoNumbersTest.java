package com.leetcode.hot100.day06;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.leetcode.hot100.common.ListNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0002AddTwoNumbersTest {
    private final P0002AddTwoNumbers solution = new P0002AddTwoNumbers();

    @Test
    void addsNumbersInReverseOrder() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        assertArrayEquals(new int[] {7, 0, 8}, values(solution.addTwoNumbers(l1, l2)));
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
