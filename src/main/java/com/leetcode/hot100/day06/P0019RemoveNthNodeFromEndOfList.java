package com.leetcode.hot100.day06;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 19. 删除链表的倒数第 N 个结点。 */
public class P0019RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode reverseHead = reverseList(head);
        ListNode shadowHead = new ListNode( -1 , reverseHead);
        ListNode pre = shadowHead;
        ListNode current = shadowHead.next;
        for (int i = 1 ; i < n ; i++) {
            pre = pre.next;
            current = current.next;
        }
        pre.next = current.next;
        return reverseList(shadowHead.next);
    }

    /** 第二种实现，留作独立练习。 */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(-1, head);
        ListNode first = head;
        ListNode second = node;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while(first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return node.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode current  = head;
        ListNode pre = null;
        while(current!=null) {
            ListNode tempNode = current.next;
            current.next = pre;
            pre = current;
            current = tempNode;
        }
        return pre;
    }
}
