package org.example.SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //int[] arr = {2, 6, 1, 4, 9, 7, 1, 5, 7};
        //int[] arr = {1,2,3,4,5};
        int[] arr = {-31, 7, 0, -5, 32, 909, -103, 8, 99, -43};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped;
        //run steps n-1 times
        for(int i = 0; i <= arr.length - 1; i++){
            swapped = false;
            //for each step, max item will come out at last respective index
            for(int j = 1; j < arr.length; j++){
                //swap if the item is smaller than pervious item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if did not swap for a particular value of i, it means array is sorted hence stop the program.
            if(!swapped){  // will give true;
                break;
            }
        }
    }
}
