package com.ib.solutions;

import com.ib.algorithms.search.*;

public class BinarySearchSolution extends Search {
    // Time Complexity = O(Log n)

    @Override
    public int search(int[] arr, int key) {
        if(arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;
        int mid;

        do {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        } while (low <= high);

        System.out.printf("Key %s not found in the array", key);
        return -1;
    }
}

