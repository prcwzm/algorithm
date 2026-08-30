package com.leetcode.hot100.day07;

import com.leetcode.hot100.common.TreeNode;

/** LeetCode 104. 二叉树的最大深度。 */
public class P0104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return reduceMax(root);
    }

    public  int reduceMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //左节点
        int left = reduceMax(root.left) + 1;
        int right = reduceMax(root.right) + 1;
        return Math.max(left, right);
    }
}
