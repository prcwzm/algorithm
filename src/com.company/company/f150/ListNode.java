package com.company.f150;

  public class ListNode {
      public int getVal() {
          return val;
      }

      public void setVal(int val) {
          this.val = val;
      }

      public ListNode getNext() {
          return next;
      }

      public void setNext(ListNode next) {
          this.next = next;
      }

      public int val;
      public ListNode next;
        public   ListNode(int x) {
          val = x;
          next = null;
        }
  }
