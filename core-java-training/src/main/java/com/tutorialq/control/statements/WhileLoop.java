package com.tutorialq.control.statements;

/**
 * Program to print even/odd numbers up to 100 using while loop
 */
public class WhileLoop {

    public static void main(String[] args) {
        int i = 0;
        String evenString = "Even Numbers: ", oddString = "Odd Numbers: ";

        while(i < 100) {
            ++i;
            if(i % 2 == 0) {
                evenString += i + "\t";
            } else {
                oddString += i + "\t";
            }
        }
        System.out.println(evenString + "\n" + oddString );
    }

}
