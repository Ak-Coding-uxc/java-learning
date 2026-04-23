package com.example.javaprograms.utils;

/**
 * Utility methods for simple integer array operations.
 */
public final class array_utils {

    private array_utils() {
        // Utility class
    }

    public static int maxElement(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static boolean contains(int[] values, int target) {
        if (values == null) {
            return false;
        }

        for (int value : values) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
}
