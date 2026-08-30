package com.leetcode.hot100.day09;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.leetcode.hot100.common.TreeNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0098ValidateBinarySearchTreeTest {
    private final P0098ValidateBinarySearchTree solution = new P0098ValidateBinarySearchTree();

    @Test
    void acceptsValidSearchTree() {
        assertTrue(solution.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }

    @Test
    void rejectsInvalidSearchTree() {
        assertFalse(solution.isValidBST(new TreeNode(1, new TreeNode(1),null)));
    }
}
