package com.sumant;

import java.util.Scanner;

public class seven_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0,n;
        int a=0;
        int b=1;
        System.out.println("Enter the nth value: ");
        n=sc.nextInt();
        System.out.println("Fibonacci Series: ");
        while(sum<n)
        {
            System.out.print(sum + " " );
            a=b;
            b=sum;
            sum = a+b;
        }
    }
}
