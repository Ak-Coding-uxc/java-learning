package com.example.javaprograms.utils;

/**
 * Utility methods for basic math operations.
 */
public final class math_utils {

    private math_utils() {
        // Utility class
    }

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int[] multiplicationTable(int number) {
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        return table;
    }
}
