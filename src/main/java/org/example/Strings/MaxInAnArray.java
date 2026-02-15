package org.example.Strings;

public class MaxInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5, 6, 7, 8, 9};

        System.out.println("The maximum element in an array is -> " + max(arr));;
    }
    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
