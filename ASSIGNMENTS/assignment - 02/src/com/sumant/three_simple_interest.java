package com.sumant;

import java.util.Scanner;

public class three_simple_interest {
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        System.out.print("Enter Prinicpal: ");
        float pri = si.nextFloat();
        System.out.print("Enter Rate: ");
        float rat = si.nextFloat();
        System.out.print("Enter Time: ");
        float time = si.nextFloat();

        float sim;
        sim = (pri * rat * time);
        System.out.print("Simple interest is " + sim);




    }
}
