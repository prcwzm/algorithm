package com.leetcode.hot100.day05;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 141. 环形链表。 */
public class P0141LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode aPtr = head;
        ListNode bPtr = head.next;
        while(aPtr != null || bPtr != null) {
            if (aPtr==bPtr){
                return true;
            }
            if (aPtr!=null){
                aPtr = aPtr.next;
            }
            if (bPtr != null && bPtr.next !=null){
                bPtr = bPtr.next.next;
            } else {
                return false;
            }
        }
        return false;
    }
}
