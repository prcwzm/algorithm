package com.leetcode.hot100.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.hot100.common.TreeNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0105ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    private final P0105ConstructBinaryTreeFromPreorderAndInorderTraversal solution =
            new P0105ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    void rebuildsTreeFromTraversals() {
        TreeNode root = solution.buildTree(new int[] {3, 9, 20, 15, 7},
                new int[] {9, 3, 15, 20, 7});
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);
    }
}
