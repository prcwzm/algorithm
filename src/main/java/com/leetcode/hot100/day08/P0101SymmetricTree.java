package com.leetcode.hot100.day08;

import com.leetcode.hot100.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/** LeetCode 101. 对称二叉树。 */
public class P0101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode l, TreeNode r) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(l);
        queue.add(r);
        while(!queue.isEmpty()) {
            TreeNode u = queue.poll();
            TreeNode v = queue.poll();
            if (u == null && v == null) {
                continue;
            }
            if (u == null || v == null || v.val != u.val) {
                return false;
            }

            queue.offer(u.right);
            queue.offer(v.left);

            queue.offer(u.left);
            queue.offer(u.right);
        }
        return true;
    }

}
