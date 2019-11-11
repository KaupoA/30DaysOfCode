package com.company;

public class Main {

    private static void practiceWhileLoop() {
        int x = 0;
        while (x <= 5) {
            // System.out.println("The value of x is " + x);

            if (x % 2 == 0) {
                System.out.println(x + " is even.");
            } else {
                System.out.println(x + " is not even.");
            }
            // x = x + 1;
            x++;
        }
    }

    private static void practiceDoWhileLoop() {
        int x = 0;
        do{
            System.out.println("The value of x is " + x);
            x++;
        } while (x <= 10);
    }

    private static void practiceForLoops() {
        for (int x = 0; x <= 5; x++) {
            for (int y = 0; y <= 5; y++) {
                System.out.println("(" + x + "," + y + ")");
            }
        }
    }

    public static void main(String[] args) {
        practiceWhileLoop();
        practiceDoWhileLoop();
        practiceForLoops();
    }
}
