package com.leetcode.hot100.day05;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 142. 环形链表 II。 */
public class P0142LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next!=null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode finder = head;
                while(finder != slow) {
                    finder = finder.next;
                    slow = slow.next;
                }
                return finder;
            }
        }
        return null;
    }
}
