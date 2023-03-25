package com.sumant;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose factors you want:");
        int n = in.nextInt();

        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                System.out.print(i +" ");
            }

        }
    }
}
