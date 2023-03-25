package com.sumant;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b)
        {
            if (a>c){
                System.out.println("a is the largest");
            }
            else {
                System.out.println("c is the lagest");
            }
        }
        else {
            if (b>c){
                System.out.println("b is the largest");
            }
            else {
                System.out.println("c is the largest");
            }
        }

    }
}
