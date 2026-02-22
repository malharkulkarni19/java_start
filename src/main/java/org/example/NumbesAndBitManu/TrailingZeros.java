package org.example.NumbesAndBitManu;

public class TrailingZeros {
    public static void main(String[] args) {
//        System.out.println(Integer.numberOfTrailingZeros(84));  // in built in java, but not a ideal solution

        int num = 84,count = 0;

        // While the last bit is a 0...
        while ((num & 1) == 0) {
            count++;           // Add 1 to our zero count
            num = num >> 1;    // Shift everything to the right by 1
        }

        System.out.println(count);
    }
}
