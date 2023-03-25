package com.sumant;

import java.util.Scanner;

public class tillzerolargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n2 = 0;
        System.out.println("Enter number: ");
        int n = in.nextInt();
        while(n!=0){
            int n1=n;
            System.out.println("Enter number");
            n = in.nextInt();
            if(n1>n){
                n2 = n1;
            }
            else {
               n2 = n;
            }
        }
        System.out.println("Greatest Number is :" + n2);
    }
}
