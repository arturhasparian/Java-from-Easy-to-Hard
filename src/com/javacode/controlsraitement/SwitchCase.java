package com.javacode.controlsraitement;

public class SwitchCase {
    public static void main(String[] args) {
        String dayOfTheWeek = args[0];
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("This is a first working day");
                break;
            case "tuesday":
                System.out.println("This is a second working day");
                break;
            case "wednesday":
                System.out.println("This is a third working day");
                break;
            case "thursday":
                System.out.println("This is a fourth working day");
                break;
            case "friday":
                System.out.println("This is a fifth working day");
            case "saturday":
            case "sunday":
                System.out.println("Finally weekend ");
                break;
            default:
                System.out.println("Not a day of the week");
        }
    }
}