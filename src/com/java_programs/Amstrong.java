package com.company;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNo = in.nextInt();
        System.out.println(amstrong(inputNo));
    }

    static int noOfDigits(int no) {
        int count = 0;
        while (no > 0) {
            int rem = no % 10;
            no = no / 10;
            count++;
        }
        return count;
    }

    static boolean amstrong(int n) {
        int digits = noOfDigits(n);
        long temp = n;
        double sum = 0;
        while (n > 0) {
            long rem = n % 10;
            n = n / 10;
            double power = Math.pow(rem, digits);
            sum = sum + power;
        }
        return sum == temp;


    }
}