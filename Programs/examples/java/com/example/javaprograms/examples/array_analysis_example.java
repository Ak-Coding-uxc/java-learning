package com.example.javaprograms.examples;

import com.example.javaprograms.utils.array_utils;

import java.util.Scanner;

public class array_analysis_example {
    private static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = new int[ARRAY_SIZE];

            for (int i = 0; i < values.length; i++) {
                System.out.printf("Enter value for index[%d]: ", i);
                values[i] = scanner.nextInt();
            }

            int max = array_utils.maxElement(values);
            System.out.printf("The maximum element is %d%n", max);

            System.out.print("Enter element to search: ");
            int target = scanner.nextInt();

            boolean found = array_utils.contains(values, target);
            if (found) {
                System.out.printf("%d is found in array%n", target);
            } else {
                System.out.printf("%d is not found in array%n", target);
            }
        }
    }
}
