package org.example.Hashing;

import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        hm.put(1, "Orange");
        hm.put(2, "Banana");
        hm.put(3, "Apple");

        System.out.println(hm);
    }
}
