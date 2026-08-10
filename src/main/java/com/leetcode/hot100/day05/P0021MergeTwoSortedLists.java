package com.leetcode.hot100.day05;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 21. 合并两个有序链表。 */
public class P0021MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pHead = new ListNode(-1);
        ListNode prePtr = pHead;
        while( list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prePtr.next = list1;
                list1 = list1.next;
            } else {
                prePtr.next = list2;
                list2 = list2.next;
            }
            prePtr = prePtr.next;
        }
        prePtr.next = list1 == null ? list2 : list1;
        return pHead.next;
    }
}
