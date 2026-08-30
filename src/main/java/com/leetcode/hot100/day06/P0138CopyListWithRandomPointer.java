package com.leetcode.hot100.day06;

/** LeetCode 138. 随机链表的复制。 */
public class P0138CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        //1. 获取新增当前模拟节点
        for (Node n = head; n != null; n = n.next.next ) {
            Node newHead = new Node(n.val); // 节点赋值
            newHead.next = n.next; //下节点赋值
            n.next = newHead; // 节点绑定
        }
        //2. random节点赋值
        for (Node n = head; n != null; n = n.next.next) {
            //当前节点的random节点
            n.next.random = (n.random != null) ? n.random.next : null;
        }
        //3. 解开链条
        Node newHead = head.next;
        for (Node n = head; n !=null; n = n.next) {
            Node newNode = n.next;
            n.next = newNode.next;
            newNode.next = n.next!=null ? n.next.next : null;
        }
        return  newHead;
    }

    public static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
        }
    }
}
