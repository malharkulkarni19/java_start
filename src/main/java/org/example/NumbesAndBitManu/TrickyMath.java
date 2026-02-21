package org.example.NumbesAndBitManu;

public class TrickyMath {
    public static void main(String[] args) {
        int low = 2_000_000_000;
        int high = 2_100_000_000;
        int mid = (low + high) / 2;
        System.out.println(mid);  // will give negative solution because it crosses max integer limit

        double res = 0.1 + 0.2;
        System.out.println(res == 0.3);  //give false according to IEEE 754 floating point, solution is 0.300000000000004

        // PRO TIP = for finnacial calucations never use double or float, use long or decimal classes
    }
}
