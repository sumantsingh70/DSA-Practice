package com.sumant;

import java.util.Scanner;

public class area_eq_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of equilateral Triangle: ");
        float s = in.nextFloat();

        System.out.println("Area of triangle is: " + (Math.sqrt(3)/4)*(s*s));
    }
}
