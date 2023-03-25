package com.sumant;

import java.util.Scanner;

public class four_operation {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.print("Enter No. 1: ");
        float no1 = no.nextFloat();
        System.out.print("Enter No. 2: ");
        float no2 = no.nextFloat();


        System.out.println("To Add numbers Press 1. ");
        System.out.println("To Subtract numbers Press 2. ");
        System.out.println("To Multiply numbers Press 3. ");
        System.out.println("To Divide numbers Press 4. ");
        System.out.print("Enter the operation you want to operate on these two numbers: ");
        int op = no.nextInt();
        if (op==1)
        {
            System.out.println("Sum of two numbers is " + (no1+no2));
        }
        if (op==2)
        {
            System.out.println("Subtraction of two numbers is " + (no1-no2));
        }
        if (op==3)
        {
            System.out.println("Multiplication of two numbers is " + (no1*no2));
        }
        if (op==4)
        {
            System.out.println("Division of two numbers is " + (no1/no2));
        }

    }
}
