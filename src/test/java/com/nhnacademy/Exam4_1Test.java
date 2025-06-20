package com.nhnacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam4_1Test {

    @ParameterizedTest
    @DisplayName("요세푸스 문제 테스트")
    @CsvSource({
            "7, 3, 4",
            "5, 2, 3",
            "6, 5, 1",
            "10, 3, 4",
            "4, 2, 1"
    })
    void testSolveJosephus(int n, int k, int expected) {
        assertEquals(expected, Exam4_1.solveJosephus(n, k));
    }
}
