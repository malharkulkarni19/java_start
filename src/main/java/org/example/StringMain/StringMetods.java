package org.example.StringMain;

import java.util.Arrays;
import java.util.Locale;

public class StringMetods {
    public static void main(String[] args) {
        String name = "MALHAR KULKARNI";
        System.out.println(name.toLowerCase());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('L'));
        System.out.println(name.replace('L', 'i'));
        System.out.println(Arrays.toString(name.replace('L', 'i').toCharArray()));
    }
}
