package org.example.StringMain;

import java.util.ArrayList;

import static java.lang.String.valueOf;

public class PreetyPrinting {
    public static void main(String[] args) {
        System.out.println((char) ('m' + 9));
        System.out.println("Malhar" + new ArrayList<>());
        System.out.println("Malhar" + " " + valueOf(56));
        String ans = valueOf(56) + " " + new ArrayList<>();
        System.out.println(ans);
    }
}
