package com.example.app.ds.sort;

import java.util.Arrays;

public class RadixSort {
    public static void radixsort(int arr[], int n) {
        int M = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);

        for (int i = 1; M / i > 0; i *= 10) {
            countSort(arr, n, i);
        }
    }

    public static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int count[] = new int[10];

        // ocurrencias
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

       // Sumar sucesivamente
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Se coloca en la posicion final y decrementa para elementos iguales
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // copiar output a arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
