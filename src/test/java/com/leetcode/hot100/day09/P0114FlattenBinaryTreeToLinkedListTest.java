package com.leetcode.hot100.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.leetcode.hot100.common.TreeNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0114FlattenBinaryTreeToLinkedListTest {
    private final P0114FlattenBinaryTreeToLinkedList solution = new P0114FlattenBinaryTreeToLinkedList();

    @Test
    void flattensInPreorder() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6)));
        solution.flatten(root);
        assertEquals(1, root.val);
        assertEquals(2, root.right.val);
        assertEquals(3, root.right.right.val);
        assertNull(root.left);
    }
}
