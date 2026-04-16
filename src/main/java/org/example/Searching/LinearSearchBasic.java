package org.example.Searching;

import java.util.Arrays;

public class LinearSearchBasic {
    static int search(int[] arr, int a){
        for(int arrs : arr){
            if(arrs == a){  // if found in arrs array
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {21, 3, 45, 7, 8, 90, 54, 1};
        Arrays.sort(arr);
        int element = 54;
        int find = search(arr, element);

        for(int arrs : arr){
            System.out.print(arrs + " ");
        }

        if(find == 1){
            System.out.println("Element " + element + " found in array.............");
        }
        else{
            System.out.println("Element " + element + " not found in array..............");
        }
    }
}
