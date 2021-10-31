package com.java_programs;
import  java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        char[] arr={'c','j','r','e'};
        System.out.println(nextLetter(arr,'j'));
    }

    static char nextLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < letters[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        if(start==letters.length){
            return letters[0];
        }
        return letters[start];

    }

}