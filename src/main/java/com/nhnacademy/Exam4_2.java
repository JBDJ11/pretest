package com.nhnacademy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Exam4_2 {
    public static void move(Deque<Integer> from, Deque<Integer> to, int n, Deque<Integer> temp) {
        // TODO: 코드를 추가하세요.
    }

    public static String toString(Deque<Integer> poll) {
        return Arrays.toString(poll.toArray());
    }

    public static void main(String[] args) {
        Deque<Integer> pollA = new ArrayDeque<>();
        Deque<Integer> pollB = new ArrayDeque<>();
        Deque<Integer> pollC = new ArrayDeque<>();

        pollA.push(5);
        pollA.push(4);
        pollA.push(3);
        pollA.push(2);
        pollA.push(1);

        move(pollA, pollB, pollA.size(), pollC);
        System.out.println("From : " + toString(pollA) + ", To : " + toString(pollB) + ", Temp : " + toString(pollC));
    }
}
