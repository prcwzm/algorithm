package com.leetcode.hot100.day08;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.leetcode.hot100.common.TreeNode;

@Disabled("实现题解后删除此注解")
class P0543DiameterOfBinaryTreeTest {
    @Test
    void computesDiameter() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        new P0543DiameterOfBinaryTree().diameterOfBinaryTree(root);
    }
}
