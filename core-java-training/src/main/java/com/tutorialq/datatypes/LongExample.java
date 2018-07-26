package com.tutorialq.datatypes;

/**
 * Long data type is a 64-bit signed two's complement integer
 * Minimum value is -9,223,372,036,854,775,808(-2^63)
 * Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
 * Used for storing larger integer values.
 * Default value is 0L
 * Example: long a = 100000L, long b = -200000L
 */
public class LongExample {
    public static void main(String[] args) {
        long localVarlong = 10L;
        Long localVarLong = 10000L;
        Long bigLong = new Long(1000000L * 1000000L);

        System.out.println("Inside main method of LongExample --> "
                + "localVarlong: " + localVarlong
                + "\n localVarLong: " + localVarLong.longValue()
                + "\n bigLong: " + bigLong);

        System.out.println("call addMillion method for localVarlong : " + addMillion(localVarlong));
        System.out.println("call addMillion method for localVarLong : " + addMillion(localVarLong));
        System.out.println("call addBigLong method for bigLong : " + addBigLong(bigLong));
    }

    private static long addMillion(long dummyVar) {
        return dummyVar + 1000000L;
    }

    private static long addBillion(long dummyVar) {
        return dummyVar + 1000000000L;
    }

    private static Long addBigLong(long dummyVar) {
        return dummyVar + (100000000L * 100000000L);
    }
}
