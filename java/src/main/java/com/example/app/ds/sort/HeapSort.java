package com.example.app.ds.sort;

public class HeapSort {
    public static void heap_sort(int[] arr) {
        int n = arr.length;

        // Se construye el max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            max_heapify(arr, n, i);
        }

        // El primer elemento se intercambia con el último, colocándolo en su
        // posición final. Luego, se llama a max_heapify desde la raíz para
        // mantener la propiedad max-heap, y se descarta el último elemento.
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            n--;

            max_heapify(arr, n, 0);
        }
    }

    private static void max_heapify(int[] arr, int n, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;

        // se verifica que l y r sean menores que n para no acceder a elementos
        // fuera del array en las llamadas recursivas, ya que se multiplicara
        // largest y rebasara los limites del array
        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            max_heapify(arr, n, largest);
        }
    }
}
