package com.leetcode.hot100.day05;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 234. 回文链表。 */
public class P0234PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        if (head.next.next == null){
            return head.val == head.next.val;
        }
        //计算链表长度
        int sizeCount = 0;
        ListNode ptr = head;
        while (ptr !=null) {
            ptr = ptr.next;
            sizeCount++;
        }
        int reverseStart = sizeCount/2;
        ptr = head;
        for (int i = 0; i < reverseStart; i++)
        {
            ptr = ptr.next;
        }

        ListNode reverseHead = reverseList(ptr);
        ListNode startNode  = head;
        for (int i = 0; i < sizeCount/2 ; i ++) {
            if (reverseHead.val != startNode.val) {
                return false;
            }
            startNode = startNode.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
