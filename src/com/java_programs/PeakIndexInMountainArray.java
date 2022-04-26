package com.java_programs;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter array size");
//        int size = in.nextInt();
//
//        System.out.println("Enter array elements");
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = in.nextInt();
//        }
        int[] arr = {1, 3, 5, 6, 4, 2};
        System.out.println(binarySearch(arr));
    }

    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                //System.out.println(mid);
                return arr[mid];
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
