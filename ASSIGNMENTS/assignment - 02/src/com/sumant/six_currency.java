package com.sumant;

import java.util.Scanner;

public class six_currency {
    public static void main(String[] args) {
        Scanner cur = new Scanner(System.in);
        System.out.println("Enter your amount in rupees");
        float inr = cur.nextLong();
        float usd = (float) (inr*0.013);

        System.out.println("Your amount in USD: " + usd);

    }
}
