package com.java_programs;

import java.util.Scanner;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The number of even digits are " + countDigits(arr));

    }

    static int countDigits(int[] a) {
        int count = 0;
        int evenCount = 0;
        for (int j = 0; j < a.length; j++) {
            int temp = a[j];
            if (a[j] < 0) {
                temp = a[j] * -1;
            }

            while (temp > 0) {
                count++;
                temp = temp / 10;

            }
            if (count % 2 == 0) {
                evenCount++;
            }
            count = 0;
        }
        return evenCount;
    }
}
