package com.tutorialq.datatypes;

/**
 * Float data type is a single-precision 32-bit IEEE 754 floating point
 * Float is mainly used to save memory in large arrays of floating point numbers
 * Default value is 0.0f
 * Float data type is never used for precise values such as currency
 * Example: float f1 = 234.5f
 */
public class FloatExample {

    public static void main(String[] args) {
        float localVarfloat = 10f;
        Float localVarFloat = 10000.0f;
        Float bigFloat = new Float(1000000f * 1000000f);

        System.out.println("Inside main method of FloatExample --> "
                + "localVarfloat:" + localVarfloat
                + "\n localVarFloat: " + localVarFloat
                + "\n bigFloat: " + bigFloat
                + "\n bigFloat Long value: " + bigFloat.longValue());

        System.out.println("addMillion: " + addMillion(bigFloat) + " long value: " + addMillion(bigFloat).longValue());
    }

    private static Float addMillion(float dummyVar) {
        return dummyVar + 1000000.2554f;
    }

}
