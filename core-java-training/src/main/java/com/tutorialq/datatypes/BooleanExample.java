package com.tutorialq.datatypes;

public class BooleanExample {

    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = true;
        System.out.println("Inside main method of BooleanExample --> flag1: " + flag1 + " flag2: " + flag2);
        flag1 = flag2;
        System.out.println("Compare flag1 and flag2: " + (flag1 == flag2));
        //Call the compare method
        System.out.println("Calling compare: " +compare(5, 7));
        System.out.println("Calling compare: " +compare(15, 15));

    }

    static boolean compare(int x, int y) {
        return x == y;
    }
}
