package org.example.Strings;

import java.util.Arrays;

public class BasicString {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int[] value : arr) {
            for (int i : value) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
