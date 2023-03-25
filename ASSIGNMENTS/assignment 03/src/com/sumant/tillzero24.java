package com.sumant;

import java.util.Scanner;

public class tillzero24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,sum=0;
        System.out.println("Enter the number: ");
        n= in.nextInt();
        while(n!=0)
        {
            sum = sum+n;
            System.out.println("Enter the number: ");
            n =in.nextInt();


        }
        System.out.println("sum of entered number is:"+ sum);
    }
}
