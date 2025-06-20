package com.nhnacademy;

public class RationalNumberTest {
    public static void main(String[] args) {
        RationalNumber rn1 = new RationalNumber(1, 2);
        RationalNumber rn2 = new RationalNumber(3, 2);
        RationalNumber rn3 = new RationalNumber(0, 123);
        try {
            RationalNumber rn4 = new RationalNumber(2, 0);
        } catch (ArithmeticException ignore) {
            System.out.println("2/0 은 유리수로 정의될 수 없습니다.");
        }

        RationalNumber rn4 = rn1.add(rn2);
        RationalNumber rn5 = rn1.subtract(rn2);
        RationalNumber rn6 = rn1.multiply(rn2);
        RationalNumber rn7 = rn1.divide(rn2);

        System.out.println("rn1 : " + rn1 + ", " + rn1.toDouble());
        System.out.println("rn2 : " + rn2 + ", " + rn2.toDouble());
        System.out.println("rn3 : " + rn3 + ", " + rn3.toDouble());
        System.out.println("rn4 : " + rn4 + ", " + rn4.toDouble());
        System.out.println("rn5 : " + rn5 + ", " + rn5.toDouble());
        System.out.println("rn6 : " + rn6 + ", " + rn6.toDouble());
        System.out.println("rn7 : " + rn7 + ", " + rn7.toDouble());
    }
}
