package com.tutorialq.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<String>();
        for (int i = 0; i < 10; ++i) {
            namesList.add("Mahi" + i);
        }

        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
