package com.nhnacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Exam3_2Test {

    Animal[] animals = {
            new Batman(), new Tiger(), new Whale(),
            new Hawk(), new Ostrich(), new Penguin()
    };

    @Test
    @DisplayName("모든 동물의 이름 출력 테스트")
    void testAnimalToString() {
        String expected = "batman tiger whale hawk Ostrich penguin";
        String result = Arrays.stream(animals)
                .map(Animal::toString)
                .collect(Collectors.joining(" "));
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("동물의 이름과 종 출력 테스트")
    void testAnimalSpecies() {
        String expected = "batman[mammal] tiger[mammal] whale[mammal] hawk[bird] Ostrich[bird] penguin[bird]";
        String result = Arrays.stream(animals)
                .map(animal -> animal.toString() + "[" + animal.species() + "]")
                .collect(Collectors.joining(" "));
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("헤엄을 칠 수 있는 동물 찾기 테스트")
    void testSwimmableAnimals() {
        List<String> expected = List.of("batman", "tiger", "whale", "penguin");
        List<String> result = Arrays.stream(animals)
                .filter(Swimmable.class::isInstance)
                .map(Animal::toString)
                .toList();

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("날 수 있는 동물 찾기 테스트")
    void testFlyableAnimals() {
        List<String> expected = List.of("batman", "hawk");
        List<String> result = Arrays.stream(animals)
                .filter(Flyable.class::isInstance)
                .map(Animal::toString)
                .toList();

        assertEquals(expected, result);
    }
}
