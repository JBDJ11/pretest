package com.nhnacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam1_1Test {

    @ParameterizedTest
    @DisplayName("GCD 계산 테스트")
    @CsvSource({
            "14, 49, 7",
            "49, 14, 7",
            "0, 5, 5",
            "5, 0, 5",
            "10, 15, 5",
            "100, 25, 25",
            "81, 27, 27",
            "7, 13, 1",
            "-8, 12, 4",
            "12, -8, 4",
            "-8, -12, 4"
    })
    void testGcd(int a, int b, int expected) {
        assertEquals(expected, Exam1_1.gcd(a, b));
    }
}
