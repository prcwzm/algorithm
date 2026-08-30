package com.leetcode.hot100.day07;

import java.util.HashMap;
import java.util.Map;

/** LeetCode 146. LRU 缓存。 */
public class P0146LRUCache {
    public static class LRUCache {
        public class LruNode {
            int key;
            int value;
            LruNode pre;
            LruNode next;
            LruNode() {}
            LruNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        Map<Integer, LruNode> nodeMap;
        LruNode head;
        LruNode tail;
        int capacity;
        int size;

        public LRUCache(int capacity) {
            size = 0;
            this.capacity = capacity;
            this.head = new LruNode();
            this.tail = new LruNode();
            head.next = tail;
            tail.pre = head;
            nodeMap = new HashMap<>();
        }

        public int get(int key) {
            //获取节点
            LruNode node = nodeMap.get(key);
            // 如果size等于0 返回空
            if (node == null) {
                return -1;
            }

            remove(node);
            moveHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            //先看存不存在
            LruNode exist = nodeMap.get(key);
            if (exist == null){
                exist = new LruNode(key,value);
            } else  {
                remove(exist);
                exist.value = value;
            }
            if (size == capacity && capacity != 0) {
                //剔除最后一个元素
                remove(tail.pre);
            }
            moveHead(exist);
        }

        public void moveHead(LruNode node) {
            size++;
            node.next = head.next;
            node.pre = head;
            head.next = node;
            node.next.pre = node;
            nodeMap.put(node.key, node);
        }

        public void remove(LruNode node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
            nodeMap.remove(node.key);
            size--;
        }
    }
}
