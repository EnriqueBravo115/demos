package com.example.app.ds.sort;

public class SelectionSort {
    public static void sort(int[] A) {
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }
    }
}
