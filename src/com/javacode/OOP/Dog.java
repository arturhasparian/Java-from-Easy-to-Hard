package com.javacode.OOP;

public class Dog {

    private static int dogsCount;
    public final int PAWS = 4;
    public final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog() {
        dogsCount++;
        System.out.println("Dogs count is " + dogsCount);

    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size  getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wof - Wof");
            case AVERAGE:
                System.out.println("Raf - Raf");
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiaf - Tiaf");
                break;
            default:
                System.out.println("Dogs size is undefined ");
        }
    }

    public void  bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }

    }
}
