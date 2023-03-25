package com.sumant;

import java.util.Scanner;

public class one_even_or_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is even or odd: ");
        int number =  in.nextInt();
        if(number % 2 == 0)
        {
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is odd.");
        }
    }
}
