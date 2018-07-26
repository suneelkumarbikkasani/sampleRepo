package com.tutorialq.control.statements;

public class IfElseExamples {

    public static void main(String[] args) {
        System.out.println("Grade for 98 marks :" +getGrades(98));
        System.out.println("Grade for 98 marks :" +getGrades(105));
        System.out.println("Grade for 98 marks :" +getGrades(64));
        System.out.println("Grade for 98 marks :" +getGrades(54));
        System.out.println("Grade for 98 marks :" +getGrades(12));
    }

    static String getGrades(int marks) {
        String grade = "";
        if (marks >= 95 && marks <=100) {
            grade = "A+";
        } else if (marks >= 85 && marks < 95) {
            grade = "A";
        } else if (marks >= 75 && marks < 85) {
            grade = "B+";
        } else if (marks >= 65 && marks < 75) {
            grade = "B";
        } else if (marks >= 55 && marks < 65) {
            grade = "B-";
        } else if (marks >= 40 && marks < 55) {
            grade = "C";
        } else if(marks >= 0 && marks < 40){
            grade = "F";
        } else {
            grade = "Marks must be between 0 to 100";
        }
        return grade;
    }
}
