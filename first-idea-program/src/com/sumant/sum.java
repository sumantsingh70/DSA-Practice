package com.sumant;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first Number: ");
            int num1 = input.nextInt();

            System.out.print("Enter Second number: ");
            int num2 = input.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum of numbers: " + sum);
        }

    }
}
