package com.leetcode.hot100.day05;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 206. 反转链表。 */
public class P0206ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode trueHand = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return trueHand;
    }
}
