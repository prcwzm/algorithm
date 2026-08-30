package com.leetcode.hot100.day08;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.leetcode.hot100.common.TreeNode;

@Disabled("实现题解后删除此注解")
class P0102BinaryTreeLevelOrderTraversalTest {
    @Test
    void traversesByLevel() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        new P0102BinaryTreeLevelOrderTraversal().levelOrder(root);
    }
}
