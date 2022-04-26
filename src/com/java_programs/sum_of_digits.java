package com.java_programs;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        int result=0;
        int rem=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any Number");
        int no = in.nextInt();

        while (no>0){
            rem=no%10;
            result=result+rem;
            no=no/10;
        }
        System.out.println(result);
    }
}
