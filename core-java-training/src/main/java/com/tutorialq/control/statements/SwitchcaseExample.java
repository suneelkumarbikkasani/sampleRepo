package com.tutorialq.control.statements;

/**
 * Example using Switch case to get the marks range based on the grade.
 */
public class SwitchcaseExample {

    public static void main(String[] args) {
        getMarksRange("A+");
        getMarksRange("B");
        getMarksRange("");
    }

    static void getMarksRange(String grade) {
        switch (grade) {
            case "A+":
                System.out.println("Excellent! Your marks range 95-100");
                break;
            case "A":
                System.out.println("Well Done! Your marks range 85-94");
                break;
            case "B+":
                System.out.println("Great! Your marks range 75-84");
                break;
            case "B":
                System.out.println("Not Bad! Your marks range 65-74");
                break;
            case "B-":
                System.out.println("Can improve! Your marks range 55-64");
                break;
            case "C":
                System.out.println("Need for improvement! Your marks range 40-54");
                break;
            default:
                System.out.println("Failed!! See you next time.");

        }
    }

}
