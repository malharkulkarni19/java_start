package org.example.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,1,-3,4,6,-9};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0]= arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int q = 1;

        for(int x = 0; x < q; x++){
            int l = 1;
            int r = 4;

            int sum = 0;

            if(l == 0){
                sum = prefix[r];
            }
            else{
                sum = prefix[r] - prefix[l - 1];
            }
            System.out.println(sum);
        }
    }
}
