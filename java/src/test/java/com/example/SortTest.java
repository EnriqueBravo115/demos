package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import com.example.app.ds.sort.InsertionSort;
import com.example.app.ds.sort.MergeSort;

public class SortTest {
    @Test
    public void assertInsertionSortIncreasing() {
        int[] arr = { 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4 };

        InsertionSort.sortIncreasing(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void assertInsertionSortDecreasing() {
        int[] arr = { 1, 2, 3, 4 };
        int[] expected = { 4, 3, 2, 1 };

        InsertionSort.sortDecreasing(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void assertMergeSort() {
        int[] array = { 5, 4, 3, 2, 1, 0 };
        int[] expected = { 0, 1, 2, 3, 4, 5 };

        MergeSort.mergeSort(array, 0, array.length - 1);

        assertArrayEquals(expected, array);
    }
}
