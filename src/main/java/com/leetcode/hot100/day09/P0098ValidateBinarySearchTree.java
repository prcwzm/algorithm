package com.leetcode.hot100.day09;

import com.leetcode.hot100.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/** LeetCode 98. 验证二叉搜索树。 */
public class P0098ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        reduceMidList(root,list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1))
            {
                return false;
            }
        }
        return true;
    }

    void reduceMidList(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        reduceMidList(node.left,list);
        list.add(node.val);
        reduceMidList(node.right,list);
    }
}
