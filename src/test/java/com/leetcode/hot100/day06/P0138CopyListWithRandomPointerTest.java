package com.leetcode.hot100.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0138CopyListWithRandomPointerTest {
    private final P0138CopyListWithRandomPointer solution =
            new P0138CopyListWithRandomPointer();

    @Test
    void copiesNextAndRandomReferences() {
        P0138CopyListWithRandomPointer.Node first =
                new P0138CopyListWithRandomPointer.Node(7);
        P0138CopyListWithRandomPointer.Node second =
                new P0138CopyListWithRandomPointer.Node(13);
        first.next = second;
        second.random = first;

        P0138CopyListWithRandomPointer.Node copy = solution.copyRandomList(first);

        assertNotSame(first, copy);
        assertNotSame(second, copy.next);
        assertEquals(7, copy.val);
        assertEquals(13, copy.next.val);
        assertSame(copy, copy.next.random);
    }
}
