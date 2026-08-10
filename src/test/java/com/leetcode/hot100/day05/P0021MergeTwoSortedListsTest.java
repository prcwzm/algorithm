package com.leetcode.hot100.day05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.leetcode.hot100.common.ListNode;
import org.junit.jupiter.api.Test;

class P0021MergeTwoSortedListsTest {
    private final P0021MergeTwoSortedLists solution = new P0021MergeTwoSortedLists();

    @Test
    void mergesTwoSortedLists() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        assertArrayEquals(new int[] {1, 1, 2, 3, 4, 4}, values(solution.mergeTwoLists(list1, list2)));
    }

    @Test
    void handlesTwoEmptyLists() {
        assertNull(solution.mergeTwoLists(null, null));
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
