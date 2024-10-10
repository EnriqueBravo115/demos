package com.example.app.ds.sort;

public class HeapSort {
    public static void heap_sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            max_heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            n--;

            max_heapify(arr, n, 0);
        }
    }

    private static void max_heapify(int[] arr, int n, int i) {
        int l = 2 * i;
        int r = 2 * i + 1;
        int largest = i;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            max_heapify(arr, n, largest);
        }
    }
}
