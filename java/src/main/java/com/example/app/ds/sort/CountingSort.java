package com.example.app.ds.sort;

import java.util.Arrays;

public class CountingSort {
    public static int[] sort(int[] A) {
        int N = A.length;
        int M = Arrays.stream(A).max().orElse(Integer.MIN_VALUE);

        // Se crea un array en base al mayor elemento
        int[] C = new int[M + 1];

        // Se suma 1 en la posicion A[i] de C
        for (int i = 0; i < N; i++) {
            C[A[i]]++;
        }

        // Desde la posicion 1 sumar sucesivamente y guardarlos en C[i]
        for (int i = 1; i <= M; i++) {
            C[i] += C[i - 1];
        }

        int[] B = new int[N];

        // C ahora guarda las posiciones reales, los valores de A se relacionan
        // con el indice de C, el valor dentro de ese indice indica la posicion
        // final, luego se decrementa el valor ya que esa posicion contiene mas
        // valores del mismo
        for (int i = N - 1; i >= 0; i--) {
            B[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }

        return B;
    }
}
