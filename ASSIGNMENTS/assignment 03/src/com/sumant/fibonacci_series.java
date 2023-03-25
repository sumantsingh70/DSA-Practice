package com.sumant;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth no. uptill you want to print fibonaaci series: ");
        int a = in.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for (int i = 2 ; i<a ;++i )
        {
            n3=n1+n2;
            System.out.print(" "+ n3);
            n1=n2;
            n2=n3;
        }
    }
}
