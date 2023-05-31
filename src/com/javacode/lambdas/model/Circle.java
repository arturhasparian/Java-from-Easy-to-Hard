package com.javacode.lambdas.model;

public class Circle implements Shape, AnotherShape{
    public Circle() {
        System.out.println("Creating circle");
    }

    @Override
    public double calcSquare() {
        return 1;
    }

    @Override
    public double caclSomething() {
        return Shape.super.caclSomething();
    }


}
