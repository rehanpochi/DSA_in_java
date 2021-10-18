package com.company;

import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = in.nextInt();

        System.out.println("Enter array elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        reverse(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    static void reverse(int[] arr) {
        int a =arr.length-1;
        for (int i = 0; i < a; i++) {
            int temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
            a--;
        }
    }
}
