package com.javacode.OOP;

public class Test {
    public static void main(String[] args) {

        Dog sheppard = new Dog();
        sheppard.setName("Oggy");
        sheppard.setBreed("Sheppard");
        sheppard.setSize(Size.BIG);
        sheppard.bite();

        Dog bullDog = new Dog();
        bullDog.setName("Jack");
        bullDog.setBreed("Bulldog");
        bullDog.setSize(Size.AVERAGE);
        bullDog.bite();

        Dog taksas = new Dog();
        taksas.setName("DeeDee");
        taksas.setBreed("Taksas");
        taksas.setSize(Size.SMALL);
        taksas.bite();

        Size s = Size.SMALL;
        Size[] values = Size.values();
        for (int i = 0; i <values.length;i++){
            System.out.println(values[i]);
        }
    }
}
