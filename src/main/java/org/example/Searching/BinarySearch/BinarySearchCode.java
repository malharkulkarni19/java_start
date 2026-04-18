package org.example.Searching.BinarySearch;

import java.util.Arrays;

public class BinarySearchCode {
    static int search(int[] arr, int target){
        //return the index
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find middle element
            //int middle = (start + end) / 2;  //might be possible that start + end exceeds range of int in java
            int mid = start + (end-start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start  = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {13, 18,  103, 981, 1007, 23, 45, 76, 98};
        Arrays.sort(arr);
        int target = 76;

        System.out.println(target + " found on index -> " + search(arr, target));
    }
}
