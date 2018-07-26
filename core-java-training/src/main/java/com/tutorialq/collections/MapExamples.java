package com.tutorialq.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Map<Integer, String> productsMap = new HashMap<>();
        productsMap.put(123, "Shoe");
        productsMap.put(1234, "Tennis bat");
        productsMap.put(12345, "Soccer ball");
        productsMap.put(123456, "Computer");

        for (Map.Entry m : productsMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
