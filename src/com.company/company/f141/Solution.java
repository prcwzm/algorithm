package com.company.f141;



public class Solution {
    /**快慢指针 */
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while(q!=null){
            p = p.next;
            q = q.next;
            if(q!=null){
                q = q.next;
            } else{
                return false;
            }
            if(p.equals(q) ){
                return true;
            }
        }
        return false;
    }
}