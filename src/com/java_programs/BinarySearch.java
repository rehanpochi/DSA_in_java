package com.java_programs;

import java.util.Scanner;

public class BinarySearch {
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

        System.out.println(binarySearch(arr, number));
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
             if (target > nums[mid]) {
                start = mid + 1;

            } else if (target < nums[mid]) {
                end = mid - 1;
            }
            else  {
                return mid;
            }
        }
        return -1;
    }
//[-1,0,3,5,9,12]
}
