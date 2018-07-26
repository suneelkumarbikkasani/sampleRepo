package com.tutorialq.java8;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeNumbersProgram {

    public static boolean primeNumber(int n) {
        return n > 1 && IntStream.rangeClosed(2, n / 2).noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(10));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(19));
    }
}
