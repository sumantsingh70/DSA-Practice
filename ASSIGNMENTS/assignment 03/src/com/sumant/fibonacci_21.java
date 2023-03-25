package com.sumant.seven;

import java.util.Scanner;

public class fibonacci_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b =1;System.out.println(a + " " + b);
        System.out.println("enter the value of n: ");

        int n = in.nextInt();

        int sum=0;
        for (int i=1; i<=n;i++){

            System.out.print(" " + sum );
            a=b;
            b=sum;
            sum = a + b;
        }

    }
}
