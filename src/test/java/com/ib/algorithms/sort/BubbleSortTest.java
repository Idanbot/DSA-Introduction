package com.ib.algorithms.sort;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    Sort bubbleSort = new BubbleSort();

    @Test
    public void sort() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr, "Bubble Sort");
    }

    @Test
    public void sort2() {
        int[] arr = {9, 3, 7, 4, 69, 420, 42};
        int[] expected = {3, 4, 7, 9, 42, 69, 420};
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr, "Bubble Sort");
    }

    @Test
    public void sort3() {
        int[] arr = {};
        int[] expected = {};
        bubbleSort.sort(arr);
        assertArrayEquals(expected, arr, "Bubble Sort");
    }
}