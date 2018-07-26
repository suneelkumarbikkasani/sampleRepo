package com.tutorialq.control.statements;

public class ForLoop {
    public static void main(String[] args) {
        int[] numbersList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.print("Printing numbers from 1 to 11 using foreach loop: \n");
        for (int i : numbersList) {
            System.out.print(i + " \t");
        }
        System.out.print("\nPrinting numbers from 1 to 11 using regular for loop: \n");
        for (int i = 1; i < 12; ++i) {
            System.out.print(i + " \t");
        }
    }
}
