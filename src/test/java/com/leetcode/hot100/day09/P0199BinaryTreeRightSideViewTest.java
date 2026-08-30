package com.leetcode.hot100.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.hot100.common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0199BinaryTreeRightSideViewTest {
    private final P0199BinaryTreeRightSideView solution = new P0199BinaryTreeRightSideView();

    @Test
    void returnsVisibleNodeAtEachLevel() {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));
        assertEquals(List.of(1, 3, 4), solution.rightSideView(root));
    }
}
