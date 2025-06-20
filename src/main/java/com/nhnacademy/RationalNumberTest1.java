package com.nhnacademy;

import java.security.InvalidParameterException;

public class RationalNumberTest1 {

    public static void main(String[] args) {
        RationalNumber rn1 = new RationalNumber(1, 2);
        RationalNumber rn2 = new RationalNumber(3, 2);
        try {
            RationalNumber rn3 = new RationalNumber(13, 0);
        } catch (InvalidParameterException ignore) {
            System.out.println("13/0 은 유리수로 정의될 수 없습니다.");
        }
        RationalNumber rn3 = new RationalNumber(0, 13);

        System.out.println("rn1 : [" + rn1.getNumerator() + ", " + rn1.getDemominator() + "]");
        System.out.println("rn2 : [" + rn2.getNumerator() + ", " + rn2.getDemominator() + "]");
        System.out.println("rn3 : [" + rn3.getNumerator() + ", " + rn3.getDemominator() + "]");
    }
}
