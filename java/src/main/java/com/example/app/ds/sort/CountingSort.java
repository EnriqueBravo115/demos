package com.example.app.ds.sort;

public class CountingSort {
    public static int[] sort(int[] A) {
        int N = A.length;
        int M = 0;

        for (int i = 0; i < N; i++) {
            M = Math.max(M, A[i]);
        }

        int[] C = new int[M + 1];

        for (int i = 0; i < N; i++) {
            C[A[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            C[i] += C[i - 1];
        }

        int[] B = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            B[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }

        return B;
    }
}
