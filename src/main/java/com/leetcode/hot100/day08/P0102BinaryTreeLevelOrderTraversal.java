package com.leetcode.hot100.day08;

import com.leetcode.hot100.common.ListNode;
import com.leetcode.hot100.common.TreeNode;

import java.util.*;

/** LeetCode 102. 二叉树的层序遍历。 */
public class P0102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> resut  = new ArrayList<>();
        q.addFirst(root);
        int levelCount = 1;
        int nextLevelCount = 0;
        List<Integer> current = new ArrayList<>();
        while(!q.isEmpty()){
            levelCount--;
            //获取头元素
            TreeNode node = q.poll();
            current.add(node.val);
            if (node.left != null) {
                q.addLast(node.left);
                nextLevelCount++;
            }
            if (node.right != null) {
                q.addLast(node.right);
                nextLevelCount++;
            }
            if (levelCount == 0){
                levelCount = nextLevelCount;
                nextLevelCount = 0;
                resut.add(current);
                current = new ArrayList<>();
            }
        }
        return resut;
    }
}
