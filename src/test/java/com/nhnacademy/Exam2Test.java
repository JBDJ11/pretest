package com.nhnacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

class Exam2Test {

    @ParameterizedTest
    @DisplayName("2진수 -> 10진수 변환 테스트")
    @CsvSource({
            "0, 0",
            "1, 1",
            "10110, 22",
            "10010110, 150"
    })
    void testConvert2to10(String binary, long expected) {
        assertEquals(expected, Exam2.convert2to10(binary));
    }

    @ParameterizedTest
    @DisplayName("16진수 -> 10진수 변환 테스트")
    @CsvSource({
            "0, 0",
            "1, 1",
            "A, 10",
            "1A, 26",
            "AbCdEF, 11259375"
    })
    void testConvert16to10(String hex, long expected) {
        assertEquals(expected, Exam2.convert16to10(hex));
    }

    @ParameterizedTest
    @DisplayName("임의의 진수 -> 10진수 변환 테스트")
    @CsvSource({
            "10110, 2, 22",
            "A1B, 16, 2587",
            "777, 8, 511",
            "12344, 5, 974"
    })
    void testConvertNto10(String input, int notation, long expected) {
        assertEquals(expected, Exam2.convertNto10(input, notation));
    }

    @ParameterizedTest
    @DisplayName("10진수 -> M진수 변환 테스트")
    @MethodSource("testConvert10toMParams")
    void testConvert10toM(long input, int notation, String expected) {
        String result = Exam2.convert10toM(input, notation);
        assertEquals(expected, result);
    }

    static Stream<Arguments> testConvert10toMParams() {
        return Stream.of(
                Arguments.of(22, 2, "10110"),
                Arguments.of(150, 2, "10010110"),
                Arguments.of(26, 16, "1A"),
                Arguments.of(2587, 16, "A1B"),
                Arguments.of(511, 8, "777"),
                Arguments.of(974, 5, "12344"));
    }

    @ParameterizedTest
    @DisplayName("임의의 진수 -> 다른 진수 변환 테스트")
    @CsvSource({
            "A1B, 16, 2, 101000011011",
            "777, 8, 2, 111111111",
            "12344, 5, 10, 974",
            "1A, 16, 8, 32"
    })
    void testConvertNtoM(String input, int inputNotation, int outputNotation, String expected) {
        assertEquals(expected, Exam2.convertNtoM(input, inputNotation, outputNotation));
    }
}
