package com.sumant;

import java.util.Scanner;

public class avgofn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter value of n: ");
        int n = in.nextInt();
        for (int i =1;i<=n;i++)
        {
            System.out.println("Enter number:");
            int no = in.nextInt();
            sum=sum+no;
        }
        System.out.println("Average " + sum/n);
    }
}
