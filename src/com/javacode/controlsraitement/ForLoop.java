package com.javacode.controlsraitement;

public class ForLoop {
    public static void main(String[] args) {
        int e = 10;
        int n = 1;
        for (int b = 1; b < e; b++) {
            n *= b;
            System.out.println(n);
        }

        for(int b = 10; b>=0; b--){
            System.out.println(b);
        }
        int b = 10;
        while(b>=1){
            b--;
            System.out.println(b);
        }
    }
}
