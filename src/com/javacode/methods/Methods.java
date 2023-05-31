package com.javacode.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage("Oggy");
        System.out.println("Rectangle square = " + calcRectangleSquare(5, 10));
        System.out.println("Square = " + calcSqure(5));
        System.out.println("Sum of squares = " + (calcRectangleSquare(5, 10) + calcSqure(10)));


        String string1 = "I like black coffe";
        String string2 = "I like coffe";
        String string3 = "I like coffe!!!";
        System.out.println(string1.toUpperCase());
        System.out.println(string1.toLowerCase());
        System.out.println(string3.substring(0, 12));

        boolean b = string2.equals(string1);
        System.out.println(b);

        string1.startsWith("I like",1);
        System.out.println(string1.replace("black", "white"));

    }

    private static void printMessage(String name) {
        System.out.println("hello " + name + " !!");
    }

    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        return square;
    }

    static int calcSqure(int x) {
        return x * x;
    }

}
