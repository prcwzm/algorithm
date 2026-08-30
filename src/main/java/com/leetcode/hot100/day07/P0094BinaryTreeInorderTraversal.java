package com.leetcode.hot100.day07;

import com.leetcode.hot100.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/** LeetCode 94. 二叉树的中序遍历。 */
public class P0094BinaryTreeInorderTraversal {
    List<Integer> integers = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left!=null) {
            inorderTraversal(root.left);
        }
        integers.add(root.val);
        if (root.right!=null) {
            inorderTraversal(root.right);
        }
        return integers;
    }
}
