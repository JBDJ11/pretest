package com.nhnacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class Exam4_2Test {

    @Test
    @DisplayName("하노이 탑 - 3개의 원반 이동 테스트")
    void testHanoiWithThreeDisks() {
        Deque<Integer> source = new ArrayDeque<>();
        Deque<Integer> target = new ArrayDeque<>();
        Deque<Integer> temp = new ArrayDeque<>();

        source.push(3);
        source.push(2);
        source.push(1);

        Exam4_2.move(source, target, source.size(), temp);

        assertTrue(source.isEmpty()); // 원본 기둥은 비어 있어야 함
        assertEquals(3, target.size()); // 목표 기둥에 모든 원반이 있어야 함
        assertEquals("[1, 2, 3]", Exam4_2.toString(target)); // 순서 검증
    }

    @Test
    @DisplayName("하노이 탑 - 5개의 원반 이동 테스트")
    void testHanoiWithFiveDisks() {
        Deque<Integer> source = new ArrayDeque<>();
        Deque<Integer> target = new ArrayDeque<>();
        Deque<Integer> temp = new ArrayDeque<>();

        source.push(5);
        source.push(4);
        source.push(3);
        source.push(2);
        source.push(1);

        Exam4_2.move(source, target, source.size(), temp);

        assertTrue(source.isEmpty()); // 원본 기둥은 비어 있어야 함
        assertEquals(5, target.size()); // 목표 기둥에 모든 원반이 있어야 함
        assertEquals("[1, 2, 3, 4, 5]", Exam4_2.toString(target)); // 순서 검증
    }

    @Test
    @DisplayName("하노이 탑 - 1개의 원반 이동 테스트")
    void testHanoiWithOneDisk() {
        Deque<Integer> source = new ArrayDeque<>();
        Deque<Integer> target = new ArrayDeque<>();
        Deque<Integer> temp = new ArrayDeque<>();

        source.push(1);

        Exam4_2.move(source, target, source.size(), temp);

        assertTrue(source.isEmpty()); // 원본 기둥은 비어 있어야 함
        assertEquals(1, target.size()); // 목표 기둥에 1개의 원반이 있어야 함
        assertEquals("[1]", Exam4_2.toString(target)); // 순서 검증
    }
}
