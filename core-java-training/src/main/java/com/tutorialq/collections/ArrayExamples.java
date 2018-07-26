package com.tutorialq.collections;

public class ArrayExamples {

    public static void main(String[] args) {
        /*You can create an integer array of elements in different ways.
        This statement creates an array that has space for five elements but is empty */
        int[] integers1 = new int[5];
        for (int aa = 0; aa < integers1.length; aa++) {
            integers1[aa] = aa + 1;
        }
        //This statement creates the array and initializes it all at once:
        int[] integers2 = new int[]{10, 20, 30, 40, 50};
        // creates an array of 5 elements with values (without the new operator):
        int[] integers3 = {100, 200, 300, 400, 500};
        System.out.println("Integer1 list: ");
        for (int i : integers1) {
            System.out.print(i + "\t");
        }
        System.out.println("\nInteger2 list: ");
        for (int i : integers2) {
            System.out.print(i + "\t");
        }
        System.out.println("\nInteger3 list: ");
        for (int i : integers3) {
            System.out.print(i + "\t");
        }
    }
}
