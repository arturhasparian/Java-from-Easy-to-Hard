package com.javacode.hello;


public class FirstWork {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        byte b = 10;
        short c = 200;
        int a = b + 33;
        long myLongValue = 123_456_789_876L;

        float myFloatValue = 23.56F;
        double myDoubleValue = 56.45;

        double sum = a + b + c + myLongValue + myDoubleValue + myFloatValue;
        System.out.println("SUM = " + sum);

        float floatResult = myFloatValue / 3;
        System.out.println("floatResult = " + floatResult);
        double myNewDouble = 23.56;

        System.out.println("myDoubleResult = " + myNewDouble / 3);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';

        char char5 = '\u00B6';

        System.out.println("Characters");
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);

        System.out.println("SUM of Characters");
        System.out.println("Chars:" + char1 + char2 + char3 + char4 + char5);

        System.out.println("byte b = " + b);
        System.out.println("int a = " + a);
        System.out.println("short c = " + c);

        boolean b1 = true;
        boolean b2 = false;

        String s = "some string" + " some other string";
        System.out.println(s);

        short someShors = b;
        int someInt = someShors;

        someShors = (short) someInt;
        System.out.println("myLongValue " + myLongValue);
        someInt = (int) myLongValue;
        System.out.println("someInt " + someInt);
        System.out.println("someShors " + someShors);

        double someDouble = myFloatValue;
        System.out.println("someDouble = " + someDouble);

        double someIntToDouble = someInt;

        System.out.println("someIntToDouble = " + someIntToDouble);



    }
}
