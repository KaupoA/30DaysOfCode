package com.company;

import java.util.Arrays;

public class Main {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5, 2, 6, 8, 9, 4};

        String[] shoppingList = {"bananas", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 7;
        intArray2[2] = 4;
        intArray2[3] = 2;

        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));

        // Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);

        // Retrieve objects
        System.out.println(intArray2[3]);

        // Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);

        System.out.println("Special For-Loop:");
        // Special for-loop: foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }

    }
}
