package com.company.f021;



class Solution {
    public ListNodeNature mergeTwoLists(ListNodeNature l1, ListNodeNature l2) {
        ListNodeNature tempLeft;
        ListNodeNature tempRight;
        ListNodeNature master;
        if (l1.val>l2.val)
        {
            master = l2;
        }else {
            master = l1;
            l1 = l2;
        }
        l2 = master;
        while (master.next!=null||l1.next!=null)
        {
            while (master.next!=null&&master.next.val<l1.val)
            {
                master = master.next;
            }
            if (master.next==null){
                connect(master,l1,null);
                break;
            }
             tempLeft=l1;
            l1=l1.next;
            while (l1.next!=null&&master.next.val>l1.val){
                l1 = l1.next;
            }
            if (l1.next==null){
                connect(master,tempLeft,l1);
                break;
            }
            connect(master,tempLeft,l1);
        }
        return l2;
    }
    public ListNodeNature connect(ListNodeNature l1 ,ListNodeNature left,ListNodeNature right){
        if (right!=null) {
            right.next = l1.next.next;
        }
         l1.next = left;
        return right;
    }

    public static void main(String[] args) {
        ListNodeNature l1 = new ListNodeNature(1);
        ListNodeNature l2 = new ListNodeNature(1);
        ListNodeNature l3 = new ListNodeNature(2);
        ListNodeNature l4 = new ListNodeNature(3);
        ListNodeNature l5 = new ListNodeNature(4);
        ListNodeNature l6 = new ListNodeNature(4);
        l1.next = l3;
        l3.next = l5;
        l5.next = null;
        l2.next = l4;
        l4.next = l6;
        l6.next = null;
        Solution solution = new Solution();
        ListNodeNature nodeNature=solution.mergeTwoLists(l1,l2);
    }
}