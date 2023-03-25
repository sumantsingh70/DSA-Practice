package com.sumant;

import java.util.Scanner;

public class two_greeting_message {
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = na.nextLine();
        System.out.println("Dear " + name + " This email greeting is an appropriate salutation for formal email correspondence.");
    }
}
