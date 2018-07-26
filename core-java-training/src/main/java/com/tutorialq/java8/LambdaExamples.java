package com.tutorialq.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExamples {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("test", "mahi", "yamaha", "apple", "banana");

        list.sort((a, b) -> a.compareTo(b));
        list.forEach(System.out::println);
    }
}
