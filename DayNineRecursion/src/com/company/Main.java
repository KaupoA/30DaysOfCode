package com.company;

public class Main {

    private static int Summation(int n) {
        // Base Case: we are at the end
        if (n <= 0) {
            return 0;
        // Recursive Case: keep going
        } else {
            // 3 + Summation(2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation(0)
            // 3 + 2 + 1 + 0 = 6
            return n + Summation(n - 1);
        }
    }

    // 4! -->  4 *3 * 2 * 1
    private static int Factorial(int n) {
        // Base Case:
        if (n <= 1) {
            return 1;
        }
        // Recursive Case:
        else {
            // Factorial(4) = 4 * Factorial(3)
            // 4 * 3 * Factorial(2)
            // 4 * 3 * 2 * Factorial(1)
            // 4 * 3 * 2 * 1
            return n * Factorial(n-1);
        }
    }

    // 5^3 = 5 * 5 * 5
    // 5^3 = 5 * 5^2 = 5 * 5 * 5^1 = 5 * 5 * 5 * 5^0 = 5 * 5 * 5 * 1
    private static int Exponentiation(int n, int p) {
        // Base Case:
        if (p <= 0) {
            return 1;
        }
        // Recursive Case:
        else {
            // 5 * exponentiation(5, 2)
            // 5 * exponentiation(5, 1)
            // 5 * exponentiation(5, 0)
            // 5 * 5 * 5 * 1
            return n * Exponentiation(n, p - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(4));
        System.out.println(Exponentiation(5, 3));
    }
}
