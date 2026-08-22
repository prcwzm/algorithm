package com.leetcode.hot100.day08;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.leetcode.hot100.common.TreeNode;

@Disabled("实现题解后删除此注解")
class P0226InvertBinaryTreeTest {
    @Test
    void invertsTree() {
        TreeNode root = new TreeNode(4, new TreeNode(2), new TreeNode(7));
        new P0226InvertBinaryTree().invertTree(root);
    }
}
