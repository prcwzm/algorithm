package com.company.f142;

import com.company.f150.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
        {
            return null;
        }
        Set<ListNode> hashSet =new  HashSet<>();
        ListNode movingPtr = head;
        while(true){
            if(hashSet.contains(movingPtr)){
                return movingPtr;
            } else {
                hashSet.add(movingPtr);
                if (movingPtr.next==null)
                {
                    return null;
                } else {
                    movingPtr = movingPtr.next;
                }
            }
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode j = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode i = new ListNode(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = j;
        j.next = g;
        g.next = i;
        i.next = b;
        solution.detectCycle(a);
    }
}