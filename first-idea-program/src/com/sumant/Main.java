package com.sumant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My name is Sumant");

        System.out.print("Hello World");           //removing ln will not print upcoming thing in next line
        System.out.println("My name is Sumant");

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println(input.next());             //prints only first string
        System.out.println(input.nextLine());         //prints whole string

        
    }
}




