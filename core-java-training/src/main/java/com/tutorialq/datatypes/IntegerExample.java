package com.tutorialq.datatypes;

/**
 * Int data type is a 32-bit signed two's complement integer.
 * Minimum value is - 2,147,483,648 (-2^31)
 * Maximum value is 2,147,483,647(inclusive) (2^31 -1)
 * Integer is generally used as the default data type for integral values unless there is a concern about memory.
 * The default value is 0
 * Example: int a = 100000, int b = -200000
 */
public class IntegerExample {

    private static int staticVarInt = 0;

    public static void main(String[] args) {
        int localVarInt = 0;
        Integer localVarInteger = new Integer(20), localVarInteger1 = 20;

        System.out.println("Inside main method of IntegerExample --> "
                + "staticVarInt: " + staticVarInt
                + "\n localVarInt: " + localVarInt
                + "\n localVarInteger: " + localVarInteger);

        System.out.println("call addTen method for localVarInt : " + addTen(localVarInt));
        System.out.println("call addTen method for localVarInteger : " + addTen(localVarInteger));

        System.out.println("call addMillion method for localVarInt : " + addBillion(localVarInt));
    }

    private static int addTen(int dummyVar) {
        return dummyVar + 10;
    }

    private static int addBillion(int dummyVar) {
        return dummyVar + 1000000000;
    }
}
