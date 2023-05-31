package com.javacode.controlsraitement;


public class WhileDo {
    public static void main(String[] args) {
        int finalBalanse = 100000;
        double currentBalanse = 0;
        int deposite = 1000;
        int years = 0;
        double interesRate = 0.1;

        do {
            currentBalanse += deposite;
            currentBalanse = currentBalanse + currentBalanse * interesRate;
            years++;
            System.out.println("Year " + years + " " + currentBalanse);
        } while (currentBalanse < finalBalanse && years < 15);
    }
}
