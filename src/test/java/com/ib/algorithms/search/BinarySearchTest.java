package com.ib.algorithms.search;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    Search binarySearch = new BinarySearch();

    @Test
    public void search() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(0, binarySearch.search(arr, 1));
        assertEquals(1, binarySearch.search(arr, 2));
        assertEquals(2, binarySearch.search(arr, 3));
        assertEquals(3, binarySearch.search(arr, 4));
        assertEquals(4, binarySearch.search(arr, 5));
        assertEquals(5, binarySearch.search(arr, 6));
        assertEquals(6, binarySearch.search(arr, 7));
        assertEquals(7, binarySearch.search(arr, 8));
        assertEquals(8, binarySearch.search(arr, 9));
        assertEquals(-1, binarySearch.search(arr, 10));
    }

    @Test
    public void search2() {
        int[] arr = {1};
        assertEquals(0, binarySearch.search(arr, 1));
    }

    @Test
    public void search3() {
        int[] arr = {};
        assertEquals(-1, binarySearch.search(arr, 1));
    }
}