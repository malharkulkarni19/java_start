package org.example.Arrays;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(10);

        arr1.add(12);
        arr1.add(24);
        arr1.add(36);
        arr1.add(48);

        System.out.println(arr1);

        System.out.println(arr1.contains(12));
        System.out.println(arr1.contains(14));
        arr1.set(2, 98);
        System.out.println(arr1);
    }
}
