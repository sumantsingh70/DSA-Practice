package com.sumant;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Please eneter some input: ");     //want input in same line therefore removed ln
//
               int rollno = input.nextInt();
               System.out.println("Your roll no. is " + rollno);


               String name = input.nextLine() ;
               System.out.println(name);

                float marks = input.nextFloat();
                System.out.println(marks);


    }
}
