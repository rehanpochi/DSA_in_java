package com.java_programs;

import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = in.nextInt();

        System.out.println("Enter array elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the number to search");
        int number = in.nextInt();

        System.out.println(LinearSearch(arr, number));
    }

    static boolean LinearSearch(int[] arr, int reqNo) {
        for (int i = 0; i < arr.length; i++) {
            if (reqNo == arr[i]) {
                return true;
            }
        }
        return false;
    }
}


