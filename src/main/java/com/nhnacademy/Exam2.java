package com.nhnacademy;

public class Exam2 {
    public static long convert2to10(String binary) throws ArithmeticException {
        // TODO: 코드를 추가하세요.
        return 0;
    }

    public static long convert16to10(String hex) throws ArithmeticException {
        // TODO: 코드를 추가하세요.
        return 0;
    }

    public static long convertNto10(String input, int notation) throws ArithmeticException {
        // TODO: 코드를 추가하세요.
        return 0;
    }

    public static String convert10toM(long input, int notation) throws ArithmeticException {
        // TODO: 코드를 추가하세요.
        return "0";
    }

    public static String convertNtoM(String input, int inputNotation, int outputNotation) throws ArithmeticException {
        // TODO: 코드를 추가하세요.
        return "0";
    }

    public static void main(String[] args) {
        String[] binaries = {
                "0",
                "1",
                "10110",
                "10010110",
                "010110"
        };

        String[] hexdecimals = {
                "0",
                "1",
                "A",
                "1A",
                "0A1B",
                "AbCdEF"
        };

        for (String binary : binaries) {
            try {
                System.out.println(binary + " -> "
                        + Exam2.convert2to10(binary));
            } catch (ArithmeticException ignore) {
                System.out.println(binary + "은 2진수가 아닙니다.");
            }
        }

        for (String hexdecimal : hexdecimals) {
            try {
                System.out.println(hexdecimal + " -> "
                        + Exam2.convert16to10(hexdecimal));
            } catch (ArithmeticException ignore) {
                System.out.println(hexdecimal + "은 16진수가 아닙니다.");
            }
        }

        int sourceNotation = 16;
        int targetNotation = 2;

        for (String hexdecimal : hexdecimals) {
            try {
                System.out.println(hexdecimal + " -> "
                        + Exam2.convertNtoM(hexdecimal, sourceNotation, targetNotation));
            } catch (ArithmeticException ignore) {
                System.out.println(hexdecimal + "은 " + sourceNotation + "진수가 아닙니다.");
            }
        }
    }
}
