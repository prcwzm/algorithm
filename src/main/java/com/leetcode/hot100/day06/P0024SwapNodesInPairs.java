package com.leetcode.hot100.day06;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 24. 两两交换链表中的节点。 */
public class P0024SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode shadowNode = new ListNode(-1, head);
        ListNode pre = shadowNode;
        while(pre.next != null && pre.next.next != null){
            ListNode p = pre.next;
            ListNode q = pre.next.next;
            p.next = q.next;
            q.next = pre.next;
            pre.next = q;
            pre = p;
        }
        return shadowNode.next;
    }

}
