package com.example.app.ds.sort;

public class InsertionSort {
    public static void sortIncreasing(int A[]) {
        int n = A.length;

        for (int i = 1; i < n; ++i) {
            int key = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
    }

    public static void sortDecreasing(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int key = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] < key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
    }
}
