package com.sumant;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fact =1;
        System.out.println("Enter a number whose factorial you want: ");
        int n = in.nextInt();
        for (int i=n;i>=1;i--)
        {
            fact = fact * i;
        }
        System.out.println("factorial of number is:" + fact);
    }
}
