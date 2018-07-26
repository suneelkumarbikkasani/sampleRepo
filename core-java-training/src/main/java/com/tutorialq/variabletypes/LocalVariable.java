package com.tutorialq.variabletypes;

/**
 * Scope of the local variable is limited to that method in which it is declared.
 */
public class LocalVariable {

    public void calculateAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        LocalVariable test = new LocalVariable();
        test.calculateAge();
        // Code to show the scope of the local variable
        int age = 10;
        System.out.println("local age value inside main is : " + age);
    }
}
