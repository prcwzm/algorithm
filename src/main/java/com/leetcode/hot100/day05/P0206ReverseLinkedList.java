package com.leetcode.hot100.day05;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 206. 反转链表。 */
public class P0206ReverseLinkedList {

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode trueHand = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return trueHand;
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
