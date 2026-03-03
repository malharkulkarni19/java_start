package org.example.SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {23, 5, 0, -11, -8, 96};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        // Move the boundary of the unsorted array one step at a time
        for (int i = 0; i <= arr.length - 1; i++) {
            // Assume the current starting position is the smallest number
            int minIndex = i;
            // Search the rest of the array to see if there is an even smaller number
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // We found a new minimum
                }
            }
            // Swap the absolute smallest number we found with the first unsorted position
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
