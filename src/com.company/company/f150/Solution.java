package com.company.f150;


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA!=null)
        {
            tempA=tempA.next;
            lengthA++;
        }
        while (tempB!=null)
        {
            tempB=tempB.next;
            lengthB++;
        }
        tempA = headA;
        tempB = headB;
        if (lengthA>lengthB)
        {
            for (int i = 0; i< lengthA-lengthB;i++)
            {
                tempA = tempA.next;
            }
        } else if (lengthA<lengthB){
            for (int i = 0; i< lengthB-lengthA;i++)
            {
                tempB = tempB.next;
            }
        }
        Result result = new Result(null,false,false);
        resever(tempA,tempB,result);
        return result.resultNode;

    }

    private void resever(ListNode tempA, ListNode tempB, Result result) {
        if (tempA.next ==null)
        {
            if (tempA.equals(tempB))
            {
                result.hasEqual = true;
                result.isFound = true;
                result.resultNode = tempA;
            }
            return;

        }
        resever(tempA.next,tempB.next,result);
        if (result.isFound&& result.hasEqual){
            if (tempA.equals(tempB))
            {
                result.resultNode = tempA;
            } else {
                result.isFound = false;
            }
        }
    }

    public class Result{
        public ListNode resultNode;
        public boolean isFound;
        public boolean hasEqual;
        public Result(ListNode resultNode,boolean isFound,boolean hasEqual){
            this.resultNode = resultNode;
            this.isFound = isFound;
            this.hasEqual = hasEqual;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode j = new ListNode(5);
        ListNode g = new ListNode(0);
        ListNode i = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        j.next = g;
        g.next = i;
        i.next = c;
        Solution solution = new Solution();
        System.out.printf(String.valueOf(solution.getIntersectionNode(a,j).val));
    }

}
