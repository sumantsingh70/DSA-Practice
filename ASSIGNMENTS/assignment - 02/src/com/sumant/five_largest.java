package com.sumant;

import java.util.Scanner;

public class five_largest {
    public static void main(String[] args) {
        Scanner lar = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        float no1 = lar.nextFloat();
        System.out.print("Enter Number 2: ");
        float no2 = lar.nextFloat();

        if (no1>no2)
        {
            System.out.println("Number 1 is greater. ");
        }
        if (no1<no2)
        {
            System.out.println("Number 2 is greater. ");
        }
        else
        {
            System.out.println("Both are equal. ");
        }
    }
}
