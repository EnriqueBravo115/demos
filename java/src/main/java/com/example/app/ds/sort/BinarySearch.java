package com.example.app.ds.sort;

// solo sirve para arreglos ordenados
public class BinarySearch {
    public static boolean search(int arr[], int x) {
        int low = 0;
        int high = arr.length;

        do {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return true;
            }
            if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        } while (low <= high);

        return false;
    }
}
