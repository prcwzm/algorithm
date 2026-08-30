package com.leetcode.hot100.day04;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 160. 相交链表。 */
public class P0160IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aPtr = headA;
        ListNode bPtr = headB;
        while(aPtr != bPtr) {
            aPtr = aPtr !=null ? aPtr.next : headB;
            bPtr = bPtr !=null ? bPtr.next : headA;
        }
        return aPtr;
    }
}
