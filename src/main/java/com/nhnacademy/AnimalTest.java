package com.nhnacademy;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = { new Batman(), new Tiger(), new Whale(),
                new Hawk(), new Ostrich(), new Penguin() };

        for (Animal animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println();

        for (Animal animal : animals) {
            System.out.print(animal + "[" + animal.species() + "] ");
        }
        System.out.println();

        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(Arrays.stream(animals)
                .filter(Flyable.class::isInstance).toArray()));
    }
}
