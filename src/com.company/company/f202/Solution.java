package com.company.f202;

class Solution {
    public  ListNode reverseList(ListNode head) {
        if (head== null || head.next == null)
        {
            return  head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
    ListNode header;
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        Solution solution = new Solution();
        ListNode head= solution.reverseList(a);
    for (; head!=null ; head = head.next){
        System.out.printf(String.valueOf(head.val));
    }
    }
}