package com.leetcode.hot100.day08;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.leetcode.hot100.common.TreeNode;

@Disabled("实现题解后删除此注解")
class P0101SymmetricTreeTest {
    @Test
    void detectsSymmetry() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        new P0101SymmetricTree().isSymmetric(root);
    }
}
