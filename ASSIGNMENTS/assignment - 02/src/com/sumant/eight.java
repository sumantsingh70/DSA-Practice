package com.sumant;



import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check palindrome or not: ");
        String str = sc.next();
        boolean flag = true;
        str=str.toLowerCase();
        for (int i=0; i<str.length()/2;i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                break;
            }
        }
            if (flag)
            {
                System.out.println("Given String is Palindrome.");
            }
            else{
                System.out.println("Given string is not palindrome.");
            }


    }
}
