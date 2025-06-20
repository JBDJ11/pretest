package com.nhnacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Exam1_2Test {

    @ParameterizedTest
    @DisplayName("피보나치 수열 테스트")
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "8, 21",
            "9, 34",
            "10, 55"
    })
    void testFibonacci(int input, int expected) {
        assertEquals(expected, Exam1_2.fibonacci(input));
    }
}
