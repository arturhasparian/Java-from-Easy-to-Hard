package com.javacode.controlsraitement;

public class IfElse {
    public static void main(String[] args) {

        int testScore = 95;
        System.out.println("You've got ");
        if (testScore >= 90) {
            System.out.println("an Exelent ");

        } else if (testScore >= 75) {
            System.out.println("a good ");

        } else if (testScore >= 60) {
            System.out.println("a satisfactory ");
        } else {
            System.out.println("a bad ");

        }
        System.out.println("mark");

    }
}
