package collections.arrays;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        boolean reload = true;
        int[] myArray = new int[4];
        System.out.println("Please enter 12 int elements");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Next element");
            myArray[j] = scanner.nextInt();
        }
        int [] array = sort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element # " + i + " = " + myArray[i]);
        }
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

}



