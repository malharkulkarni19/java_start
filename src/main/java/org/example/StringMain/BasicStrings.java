package org.example.StringMain;

import java.util.Arrays;

public class BasicStrings {
    public static void main(String[] args) {
        String name = "Malhar Kulkarni";
        System.out.println(name);

//          String a = "Malhar";
//          System.out.println(a);
//          String b = "Malhar";
//          System.out.println(a==b);   // equals in this case
//        a = "Kulkarni";
//        System.out.println(a);
//        System.out.println(a==b);

//        String name1 = new String("Malhar");
//        String name2 = new String("Malhar");
//        System.out.println(name1 == name2);  //false
//        System.out.println(name1.equals(name2));  //true, it only cares about value

        System.out.println(Arrays.toString(new int[]{2,3,4,5,6,7,8,9}));  // toString method
    }
}
