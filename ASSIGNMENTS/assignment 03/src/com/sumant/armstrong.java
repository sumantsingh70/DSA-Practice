package com.sumant;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int sum =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int n1=n;


        while(n!=0)
        {
            int n2=n%10;
            sum = sum + (n2*n2*n2);
            n=n/10;

        }
        if (sum==n1){
            System.out.println("yes it is an armstrong number.");
        }
        else {
            System.out.println("no it is not an armstrong number.");
        }

    }
}
