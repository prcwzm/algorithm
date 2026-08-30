package com.leetcode.hot100.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("实现题解后删除此注解")
class P0295FindMedianFromDataStreamTest {
    @Test
    void calculatesMedianAfterEachInsertion() {
        P0295FindMedianFromDataStream.MedianFinder finder =
                new P0295FindMedianFromDataStream.MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        assertEquals(1.5, finder.findMedian());
        finder.addNum(3);
        assertEquals(2.0, finder.findMedian());
    }
}
