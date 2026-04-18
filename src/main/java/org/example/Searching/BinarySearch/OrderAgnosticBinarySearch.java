package org.example.Searching.BinarySearch;

public class OrderAgnosticBinarySearch {
    static int search(int[] arr, int target){
        //return the index
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find middle element
            //int middle = (start + end) / 2;  //might be possible that start + end exceeds range of int in java
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]){
                    start  = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start  = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-14, -2, 0, 9, 89, 655, 876, 908, 1007};
        int target = 1009;
        System.out.println(target + " found at index -> " + search(arr, target));
    }
}
