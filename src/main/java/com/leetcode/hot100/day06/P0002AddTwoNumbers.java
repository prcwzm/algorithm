package com.leetcode.hot100.day06;

import com.leetcode.hot100.common.ListNode;

/** LeetCode 2. 两数相加。 */
public class P0002AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1 = l1;
        ListNode rl2 = l2;
        ListNode tmpNode = new ListNode(-1);
        ListNode ptr = tmpNode;
        int addition = 0;
        while(rl1 != null && rl2 != null){
            int value = (rl1.val + rl2.val + addition)%10;
            addition = (rl1.val + rl2.val + addition)/10;
            ptr.next = new ListNode(value);
            ptr = ptr.next;
            rl1 = rl1.next;
            rl2 = rl2.next;
        }
        ptr.next = rl1 == null ? rl2 : rl1;

        while(addition == 1){
            if (ptr.next == null) {
                ptr.next = new ListNode(1);
                break;
            }
            ptr = ptr.next;
            addition = (ptr.val + 1)/10;
            ptr.val = (ptr.val + 1)%10;
        }
        return tmpNode.next;
    }

}
