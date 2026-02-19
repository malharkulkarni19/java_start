package org.example.Arrays;

import java.util.Arrays;

public class SwapElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Before Swapping -> ");
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println();

        swap(arr, 0,4);

        System.out.print("After Swapping -> ");
        System.out.print(Arrays.toString(arr) + " ");
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
