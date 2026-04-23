package com.example.javaprograms.examples;

import com.example.javaprograms.utils.math_utils;

import java.util.Scanner;

public class factorial_example {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative number: ");
            int number = scanner.nextInt();

            long factorial = math_utils.factorial(number);
            System.out.printf("Factorial of %d is %d%n", number, factorial);
        }
    }
}
