package com.sumant;

import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");

        float r = in.nextFloat();

        System.out.println("Area of circle: " + (3.14*r*r));
    }
}
