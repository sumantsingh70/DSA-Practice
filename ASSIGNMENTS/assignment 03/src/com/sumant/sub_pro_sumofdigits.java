package com.sumant;

import java.util.Scanner;

public class sub_pro_sumofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0,pro=1;
        System.out.println("Enter the number for operation: ");
        int n = in.nextInt();
        while(n!=0)
        {
            int n1=n%10;
            sum = sum +n1;
            pro = pro*n1;
            n=n/10;
        }
        System.out.println("sum of digits of an integer."+sum);
        System.out.println("product of digits of an integer."+pro);

    }
}
