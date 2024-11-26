package com.example.app.ds.sort;

public class MergeSort {
    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge_centinels(A, p, q, r);
        }
    }

    private static void merge_centinels(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = A[q + j + 1];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i++];
            } else {
                A[k] = R[j++];
            }
        }
    }

    public static void merge_no_centinels(int[] A, int p, int q, int r) {
        int nl = q - p + 1;
        int nr = r - q;

        int[] L = new int[nl + 1];
        int[] R = new int[nr + 1];

        for (int i = 0; i < nl; i++) {
            L[i] = A[p + i];
        }

        for (int j = 0; j < nr; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = p;

        while (i < nl && j < nr) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < nl) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < nr) {
            A[k] = R[j];
            j++;
            k++;
        }
    }
}
