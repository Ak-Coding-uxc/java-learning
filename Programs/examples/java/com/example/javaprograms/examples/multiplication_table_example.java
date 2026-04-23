package com.example.javaprograms.examples;

import com.example.javaprograms.utils.math_utils;

import java.util.Scanner;

public class multiplication_table_example {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int[] table = math_utils.multiplicationTable(number);
            for (int i = 0; i < table.length; i++) {
                System.out.printf("%d x %d = %d%n", number, i + 1, table[i]);
            }
        }
    }
}
