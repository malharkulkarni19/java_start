package org.example.Searching;

public class SearchInRange {
    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;

        System.out.println("Element " +  target + " found in " + search(arr, target, 1, 5) + " index");
    }
}
