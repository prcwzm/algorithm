package com.leetcode.hot100.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.hot100.common.TreeNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0230KthSmallestElementInABSTTest {
    private final P0230KthSmallestElementInABST solution = new P0230KthSmallestElementInABST();

    @Test
    void findsKthSmallestValue() {
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        assertEquals(1, solution.kthSmallest(root, 1));
        assertEquals(3, solution.kthSmallest(root, 3));
    }
}
